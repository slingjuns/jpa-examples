package com.example.jpaexamples.repositories;

import com.example.jpaexamples.entities.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeHibernateRepo {
    private final EntityManager entityManager;

    @Autowired
    public EmployeeHibernateRepo (EntityManager entityManager){
        this.entityManager = entityManager;
    }

    // CRUD...
    public Employee findByID(Long employeeId){
        return entityManager.find(Employee.class, employeeId);
    }

    public Long createEmployee(Employee e){
        entityManager.persist(e);
        return e.getId();
    }

    public Long updateEmployee(Employee e){
        return entityManager.merge(e).getId();
    }

    public void deleteEmployee(Long employeeId){
        entityManager.remove(findByID(employeeId));
    }
}
