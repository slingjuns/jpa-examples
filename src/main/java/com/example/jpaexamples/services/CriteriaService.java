package com.example.jpaexamples.services;

import com.example.jpaexamples.DTO.CriteriaDTO;
import com.example.jpaexamples.entities.Employee;
import com.example.jpaexamples.repositories.CriteriaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CriteriaService {

    @Autowired
    private CriteriaRepo criteriaRepo;

    public List<CriteriaDTO> findEmployeesByCriteria(Integer age, String departmentName) {
        return criteriaRepo.findEmployeesByAgeAndDepartmentName(age, departmentName);
    }
}
