package com.example.jpaexamples.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class CriteriaDTO {
    private String name;
    private Integer age;
    private String departmentName;
    private BigDecimal salary;

}
