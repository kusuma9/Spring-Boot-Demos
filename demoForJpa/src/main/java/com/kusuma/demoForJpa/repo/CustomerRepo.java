package com.kusuma.demoForJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kusuma.demoForJpa.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
