package com.example.spring_validation.service;

import com.example.spring_validation.dto.EmployeeDTO;
import com.example.spring_validation.entity.Employee;
import com.example.spring_validation.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesImp implements Services{

    private final EmployeeRepo employeeRepo;

    @Autowired
    public ServicesImp(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee save(EmployeeDTO employeeDTO) {
        Employee employee=Employee.builder()
                .empName(employeeDTO.getEmpName())
                .email(employeeDTO.getEmail())
                .phoneNo(employeeDTO.getPhoneNO())
                .address(employeeDTO.getAddress())
        .build();
        return employeeRepo.save(employee);
    }
}
