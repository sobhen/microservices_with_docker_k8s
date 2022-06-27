package com.microservices.customer.services;

import com.microservices.customer.entity.Customer;
import com.microservices.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer getCustomerById(Long customerId) {
        Optional<Customer> customerOpt = customerRepository.findById(customerId);
        return customerOpt.isPresent() ? customerOpt.get() : new Customer();
    }
}
