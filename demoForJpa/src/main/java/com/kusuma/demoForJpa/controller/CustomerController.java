package com.kusuma.demoForJpa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kusuma.demoForJpa.entity.Customer;

@RestController
public class CustomerController {
	
	@PostMapping("/customer")
	public void createCustomer(@RequestBody Customer customer) {
		
		System.out.println(customer);
		
	}

}
