package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.EmployeeLoginService;

@CrossOrigin
@RestController
public class EmployeeLoginController {

	@Autowired
	private EmployeeLoginService service;

	@GetMapping("/employees/{employeeEmail}/{employeePassword}")
	public boolean employeeLogin(@PathVariable String employeeEmail, @PathVariable String employeePassword) {

		if (service.employeeLogin(employeeEmail, employeePassword) != null) {
			return true;
		}
		return false;
	}

}
