package com.example.jpaexamples.repositories;

import com.example.jpaexamples.entities.Department;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentHibernateRepo{
    private final EntityManager entityManager;

    @Autowired
    public DepartmentHibernateRepo(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public Department findByID(Long departmentId){
        return entityManager.find(Department.class, departmentId);
    }
}
