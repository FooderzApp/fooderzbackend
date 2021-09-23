package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface CustomerService {

		Customer addCustomer(Customer customer);
		void deleteCustomer(int id);
		List<Customer> getAllCustomers();
		
	
}
