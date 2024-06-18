package com.aga.ems.action;

import com.aga.ems.dto.CreateCustomerDTO;
import com.aga.ems.dto.GetCustomerDTO;
import com.aga.ems.exception.ResourceNotFoundException;
import com.aga.ems.mapper.CreateCustomerDTOMapper;
import com.aga.ems.mapper.GetCustomerDTOMapper;
import com.aga.ems.models.Customer;
import com.aga.ems.repository.CustomerRepository;
import com.aga.ems.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerAction implements CustomerService {

    private final CustomerRepository customerRepository;
    private final GetCustomerDTOMapper getCustomerDTOMapper;
    private final CreateCustomerDTOMapper createCustomerDTOMapper;

    @Override
    public GetCustomerDTO findCustomerById(long id) {

        Customer customer = customerRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("customer with id [%s] not found !".formatted(id)));
        return getCustomerDTOMapper.apply(customer);
    }

    @Override
    public GetCustomerDTO saveCustomer(CreateCustomerDTO createCustomerDTO) {
        Customer customer = createCustomerDTOMapper.apply(createCustomerDTO);
        Customer savedCustomer = customerRepository.save(customer);
        return getCustomerDTOMapper.apply(savedCustomer);
    }
}
