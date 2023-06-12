package com.example.spring_validation.controller;

import com.example.spring_validation.dto.EmployeeDTO;
import com.example.spring_validation.entity.Employee;
import com.example.spring_validation.service.Services;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class EmployeeController {
    private final Services services;

    @Autowired
    public EmployeeController(Services services) {
        this.services = services;
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody  @Valid EmployeeDTO employeeDTO)
    {
        Employee employee1=services.save(employeeDTO);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }
}
