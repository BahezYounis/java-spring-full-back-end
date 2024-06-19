package com.aga.full_backend.controller;

import com.aga.full_backend.dto.CreateCustomerDTO;
import com.aga.full_backend.dto.GetCustomerDTO;
import com.aga.full_backend.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("{customerId}")
    public GetCustomerDTO getCustomer(@PathVariable("customerId") Long customerId) {
        return customerService.findCustomerById(customerId);
    }

    @PostMapping()
    public GetCustomerDTO createCustomer(@RequestBody CreateCustomerDTO customerDTO) {
        return new ResponseEntity<>(customerService.saveCustomer(customerDTO), HttpStatus.CREATED).getBody();
    }

}
