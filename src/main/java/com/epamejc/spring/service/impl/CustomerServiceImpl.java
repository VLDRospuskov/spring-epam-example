package com.epamejc.spring.service.impl;

import com.epamejc.spring.model.Customer;
import com.epamejc.spring.repository.CustomerRepository;
import com.epamejc.spring.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomersOlderThan(Integer age) {
        return customerRepository.findAll().stream()
                .filter(customer -> customer.getAge() > age)
                .collect(Collectors.toList());
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
