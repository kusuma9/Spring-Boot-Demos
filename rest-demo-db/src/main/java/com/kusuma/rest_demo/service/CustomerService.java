package com.kusuma.rest_demo.service;

import java.util.List;

import com.kusuma.rest_demo.model.Customer;

public interface CustomerService {
	
	public String createCustomer(Customer customer);
	public String updateCustomer(Customer customer);
	public String deleteCustomer(String customerId);
	public Customer getCustomer(String customerId);
	public List<Customer> getAllCustomers();

}
