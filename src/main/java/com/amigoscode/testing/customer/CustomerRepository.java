package com.amigoscode.testing.customer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

// spring boot and jpa
// jpa allows us to easily communicate with the database
public interface CustomerRepository extends CrudRepository<Customer, UUID> {
    @Query(value = "select id, name, phone number" +
            "from customer" +
            "where phone number = :phone_number",
            nativeQuery = true
    )
    Optional<Customer> selectCustomerByPhoneNumber(
            @Param("phone_number") String phoneNumber);
}
