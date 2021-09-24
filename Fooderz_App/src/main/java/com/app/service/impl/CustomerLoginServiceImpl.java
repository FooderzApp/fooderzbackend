package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repository.CustomerLoginRepository;
import com.app.service.CustomerLoginService;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService {

	@Autowired
	private CustomerLoginRepository repository;
	
	@Override
	public Customer customerLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return repository.findByUserNameAndPassword(userName, password);
	}

}
