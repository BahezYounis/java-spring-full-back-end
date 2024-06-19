package com.aga.full_backend.service;

import com.aga.full_backend.dto.CreateCustomerDTO;
import com.aga.full_backend.dto.GetCustomerDTO;

public interface CustomerService {
    GetCustomerDTO findCustomerById(long customerId);
    GetCustomerDTO saveCustomer(CreateCustomerDTO createCustomerDTO);
}
