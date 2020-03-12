package com.epamejc.spring.service;

import com.epamejc.spring.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomersOlderThan(Integer age);

    Customer saveCustomer(Customer customer);

}
