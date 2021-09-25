package com.app.service;

import com.app.model.Customer;

public interface CustomerRegistration {

	public Customer saveCustomer(Customer customer);
	public Customer fetchCustomerByUsername(String userName);
	public Customer fetchCustomerByUsernameAndPassword(String userName,String password);
	
}
