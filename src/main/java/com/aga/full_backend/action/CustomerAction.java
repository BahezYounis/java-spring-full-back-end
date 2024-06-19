package com.aga.full_backend.action;

import com.aga.full_backend.dto.CreateCustomerDTO;
import com.aga.full_backend.dto.GetCustomerDTO;
import com.aga.full_backend.exception.ResourceNotFoundException;
import com.aga.full_backend.mapper.CreateCustomerDTOMapper;
import com.aga.full_backend.mapper.GetCustomerDTOMapper;
import com.aga.full_backend.models.Customer;
import com.aga.full_backend.repository.CustomerRepository;
import com.aga.full_backend.service.CustomerService;
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
