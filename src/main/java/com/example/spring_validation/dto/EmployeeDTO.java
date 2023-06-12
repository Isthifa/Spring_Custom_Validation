package com.example.spring_validation.dto;

import com.example.spring_validation.entity.Address;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder

public class EmployeeDTO {


    @NotEmpty
    @Size(min=2,message = "employee name must have atleast 2 charactor long")
    private String empName;

    @Email
    @NotBlank
    private String email;
    @Size(min =2,message = "number must contain 10 digits")
    @NotEmpty
    private String phoneNO;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @Valid
    private Address address;
}
