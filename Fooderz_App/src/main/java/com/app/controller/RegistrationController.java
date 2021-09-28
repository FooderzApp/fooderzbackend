package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerRegistration;

@RestController
@CrossOrigin
public class RegistrationController {

	@Autowired
	private CustomerRegistration service;

	@PostMapping("/register")
	public Customer registerUser(@RequestBody Customer customer) throws Exception {
		String userNameId = customer.getUserName();
		//if (userNameId != null && !"".equals(userNameId)) {
			Customer cusobj = service.fetchCustomerByUsername(userNameId);
			if (cusobj != null) {
				throw new Exception("customer with " + userNameId + "is already exits");
			}
		//}
		Customer cusObj = null;

		cusObj = service.saveCustomer(customer);
		return cusObj;

	}
	
	@PostMapping("/login")
	public Customer loginCustomer(@RequestBody Customer customer) throws Exception {
		String userNameId = customer.getUserName();
		String password=customer.getPassword();
		Customer cusObj = null;
		if(userNameId!=null && password!=null) {
			cusObj=service.fetchCustomerByUsernameAndPassword(userNameId, password);
		}
//		if(cusObj!=null) {
//			throw new Exception("Bad details");
//		}
		return cusObj;
	}

}
