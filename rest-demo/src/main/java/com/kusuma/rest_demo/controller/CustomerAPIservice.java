package com.kusuma.rest_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kusuma.rest_demo.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerAPIservice {
	
	Customer customer;
	
	@GetMapping("{CustomerId}")
	public Customer getCustomerDetails(String CustomerId) {
		//return new Customer("C1", "Customer 1", "Address One", "Phone 1");
		return customer;
	}
	
	@PostMapping
	public String createCustomerDetails(@RequestBody Customer customer) {
		this.customer=customer;
		return "Customer created successfully !";
	}
	
	@PutMapping
	public String updateCustomerDetails(@RequestBody Customer customer) {
		this.customer=customer;
		return "Customer updated successfully !";
	}	

}
