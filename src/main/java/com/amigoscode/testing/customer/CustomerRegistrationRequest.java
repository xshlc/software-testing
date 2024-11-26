package com.amigoscode.testing.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

// this is a Model
// there is no point in testing models
public class CustomerRegistrationRequest {
    private final Customer customer;
    public CustomerRegistrationRequest(@JsonProperty("customer") Customer customer) {
         this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerRegistrationRequest{" +
                "customer=" + customer +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }
}
