package com.aga.ems.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreateCustomerDTO{
    private Long id;
    private String name;
    private String displayName;
    private String address;
    private String phone;
    private String email;
    private String password;
    private int age;
}

