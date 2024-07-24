package com.kusuma.rest_demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kusuma.rest_demo.model.Customer;
import com.kusuma.rest_demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	//Read specific Customer details
	@GetMapping("{CustomerId}")
	public Customer getCustomerDetails(@PathVariable("CustomerId") String CustomerId) {		
		return customerService.getCustomer(CustomerId);
	}
	
	//Read all Customer details
	@GetMapping()
	public List<Customer> getAllCustomerDetails() {		
		return customerService.getAllCustomers();
	}
	
	@PostMapping
	public String createCustomerDetails(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
		return "Customer created successfully !";
	}
	
	@PutMapping
	public String updateCustomerDetails(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
		return "Customer updated successfully !";
	}	
	
	@DeleteMapping("{CustomerId}")
	public String deleteCustomerDetails(@PathVariable("CustomerId") String CustomerId) {
		customerService.deleteCustomer(CustomerId);
		return "Customer deleted successfully !";
	}

}
