package com.example.spring_validation.service;

import com.example.spring_validation.dto.EmployeeDTO;
import com.example.spring_validation.entity.Employee;

public interface Services {
    Employee save(EmployeeDTO employeeDTO);
}
