package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerLoginService;

@RestController
public class CustomerLoginController {

	@Autowired
	private CustomerLoginService service;

	@GetMapping("/customer/{userName}/{password}")
	public Customer customerLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return service.customerLogin(userName, password);
	}

}
