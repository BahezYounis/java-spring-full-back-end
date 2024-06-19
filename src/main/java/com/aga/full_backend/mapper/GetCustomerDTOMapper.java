package com.aga.full_backend.mapper;

import com.aga.full_backend.dto.GetCustomerDTO;
import com.aga.full_backend.models.Customer;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class GetCustomerDTOMapper implements Function<Customer, GetCustomerDTO> {
    @Override
    public GetCustomerDTO apply(Customer customer) {
        return new GetCustomerDTO(
                customer.getId(),
                customer.getDisplayName(),
                customer.getAddress(),
                customer.getPhone(),
                customer.getAge()
        );
    }
}
