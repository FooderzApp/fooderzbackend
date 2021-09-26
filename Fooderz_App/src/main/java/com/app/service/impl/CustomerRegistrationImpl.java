package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repository.CustomerRegisterRepository;
import com.app.service.CustomerRegistration;
@Service
public class CustomerRegistrationImpl implements CustomerRegistration {

	@Autowired
	private CustomerRegisterRepository repository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Customer fetchCustomerByUsername(String userName) {
		// TODO Auto-generated method stub
		return repository.findByUserName(userName);
	}

	@Override
	public Customer fetchCustomerByUsernameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return repository.findByUserNameAndPassword(userName, password);
	}

}
