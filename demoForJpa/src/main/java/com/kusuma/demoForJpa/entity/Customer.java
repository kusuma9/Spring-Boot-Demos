package com.kusuma.demoForJpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CustomerId;
	private String CustomerName;
	private String CustomerAddress;
	private String CustomerPhone;
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public String getCustomerPhone() {
		return CustomerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		CustomerPhone = customerPhone;
	}
	public Customer(int customerId, String customerName, String customerAddress, String customerPhone) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		CustomerPhone = customerPhone;
	}
	public Customer() {
		super();		
	}
	
	@Override
	public String toString() {
		return "Customer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName + ", CustomerAddress="
				+ CustomerAddress + ", CustomerPhone=" + CustomerPhone + "]";
	}
	
	

}
