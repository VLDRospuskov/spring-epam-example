package com.epamejc.spring.controller;

import com.epamejc.spring.model.Customer;
import com.epamejc.spring.repository.CustomerRepository;
import com.epamejc.spring.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    private final CustomerService customerService;

    @PostMapping("/add")
    public Customer addCustomer(
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam Integer age
    ) {
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAge(age);
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id) {
        return customerRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/filterage")
    public List<Customer> getAllCustomersOlderThan(@RequestParam Integer age) {
        return customerService.getCustomersOlderThan(age);
    }

}
