package com.aga.ems.mapper;

import com.aga.ems.dto.CreateCustomerDTO;
import com.aga.ems.models.Customer;
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
