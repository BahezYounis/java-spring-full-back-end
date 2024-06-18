package com.aga.ems.service;

import com.aga.ems.dto.CreateCustomerDTO;
import com.aga.ems.dto.GetCustomerDTO;

public interface CustomerService {
    GetCustomerDTO findCustomerById(long customerId);
    GetCustomerDTO saveCustomer(CreateCustomerDTO createCustomerDTO);
}
