package com.example.jpaexamples.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.Set;

@Entity
@Getter
@Table(name="Department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private Set<Employee> employeeList;
}
