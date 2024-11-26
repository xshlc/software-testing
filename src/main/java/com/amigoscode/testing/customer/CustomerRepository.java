package com.amigoscode.testing.customer;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

// spring boot and jpa
// jpa allows us to easily communicate with the database
public interface CustomerRepository extends CrudRepository<Customer, UUID> {

}
