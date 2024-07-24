package com.kusuma.demoForJpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kusuma.demoForJpa.entity.Customer;
import com.kusuma.demoForJpa.repo.CustomerRepo;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepo customerRepo;
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<Customer>(customerRepo.save(customer), HttpStatus.CREATED);
		//System.out.println(customer);
		
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getCustomers() {
		return new ResponseEntity<>(customerRepo.findAll(), HttpStatus.OK);
		//System.out.println(customer);
		
	}
	
	
	@GetMapping("/customers/{CustomerId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable int CustomerId) {
		Optional<Customer> opscustomer = customerRepo.findById(CustomerId);
		if (opscustomer.isPresent()) {
			return new ResponseEntity<>(customerRepo.save(opscustomer.get()), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
	}
	
	@PutMapping("/customers/{CustomerId}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int CustomerId, @RequestBody Customer customer) {
		Optional<Customer> opscustomer = customerRepo.findById(CustomerId);
		if (opscustomer.isPresent()) {
			opscustomer.get().setCustomerName(customer.getCustomerName());
			opscustomer.get().setCustomerAddress(customer.getCustomerAddress());
			opscustomer.get().setCustomerPhone(customer.getCustomerPhone());
			return new ResponseEntity<>(customerRepo.save(opscustomer.get()), HttpStatus.OK);
		} else {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@DeleteMapping("/customers/{CustomerId}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable int CustomerId) {
		Optional<Customer> opscustomer = customerRepo.findById(CustomerId);
		if (opscustomer.isPresent()) {
			customerRepo.deleteById(CustomerId);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}		
	}

}
