package com.aga.ems.dto;


public record GetCustomerDTO(
        Long id,
        String displayName,
        String address,
        String phone,
        int age
) {
}
