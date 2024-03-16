package com.example.jpaexamples.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name="Department")
public class Department {
    @Id
    private Integer id;
    @Column
    private String name;
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private Set<Employee> employeeList;
}
