package com.kusuma.rest_demo.model;

public class Customer {

	private String CustomerId;
	private String CustomerName;
	private String CustomerAddress;
	private String CustomerPhone;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String customerName, String customerAddress, String customerPhone) {
		this.CustomerId = customerId;
		this.CustomerName = customerName;
		this.CustomerAddress = customerAddress;
		this.CustomerPhone = customerPhone;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		this.CustomerId = customerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		this.CustomerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.CustomerAddress = customerAddress;
	}

	public String getCustomerPhone() {
		return CustomerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.CustomerPhone = customerPhone;
	}

}
