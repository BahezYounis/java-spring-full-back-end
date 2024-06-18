package com.aga.ems.mapper;

import com.aga.ems.dto.GetCustomerDTO;
import com.aga.ems.models.Customer;
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
