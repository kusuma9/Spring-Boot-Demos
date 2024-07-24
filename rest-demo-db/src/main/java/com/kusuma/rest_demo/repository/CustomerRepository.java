package com.kusuma.rest_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kusuma.rest_demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
