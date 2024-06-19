package com.aga.full_backend.dto;


public record GetCustomerDTO(
        Long id,
        String displayName,
        String address,
        String phone,
        int age
) {
}
