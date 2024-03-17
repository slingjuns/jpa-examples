package com.example.jpaexamples.repositories;

import com.example.jpaexamples.entities.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeHibernateRepo {
    private final EntityManager entityManager;

    @Autowired
    public EmployeeHibernateRepo(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    // CRUD...
    public Employee findByID(Long employeeId){
        return entityManager.find(Employee.class, employeeId);
    }

    public Long createEmployee(Employee employee){
        entityManager.persist(employee);
        return employee.getId();
    }

    public Long updateEmployee(Employee employee){
        return entityManager.merge(employee).getId();
    }

    public void deleteEmployee(Long employeeId){
        entityManager.remove(findByID(employeeId));
    }
}
