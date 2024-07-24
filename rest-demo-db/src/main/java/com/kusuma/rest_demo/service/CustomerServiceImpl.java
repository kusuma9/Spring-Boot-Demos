package com.kusuma.rest_demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kusuma.rest_demo.model.Customer;
import com.kusuma.rest_demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository=customerRepository;
	}

	@Override
	public String createCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Successfully Created";
	}

	@Override
	public String updateCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Successfully Updated";
	}

	@Override
	public String deleteCustomer(String customerId) {
		customerRepository.deleteById(customerId);
		return "Successfully Deleted";
	}

	@Override
	public Customer getCustomer(String customerId) {
		return customerRepository.findById(customerId).get();		
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();		
	}

}
