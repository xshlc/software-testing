package com.amigoscode.testing.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// this class needs to be able to communicate with the database
@Service
public class CustomerRegistrationService {

    private final CustomerRepository customerRepository; // dependency injection

    @Autowired
    public CustomerRegistrationService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // take the request coming from the controller
    public void registerNewCustomer(CustomerRegistrationRequest request) {
        // just whether there's a customer with the given phone number
        // phone number should be unique
        //customerRepository.
    }
}
