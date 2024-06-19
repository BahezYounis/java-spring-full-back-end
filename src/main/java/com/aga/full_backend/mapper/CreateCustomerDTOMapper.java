package com.aga.full_backend.mapper;


import com.aga.full_backend.models.Customer;
import com.aga.full_backend.dto.CreateCustomerDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CreateCustomerDTOMapper implements Function <CreateCustomerDTO, Customer> {
    @Override
    public Customer apply(CreateCustomerDTO dto) {
        return new Customer(
                dto.getId(),
                dto.getName(),
                dto.getDisplayName(),
                dto.getAddress(),
                dto.getPhone(),
                dto.getEmail(),
                dto.getPassword(),
                dto.getAge()
        );
    }
}
