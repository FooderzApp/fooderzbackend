package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.EmployeeLoginService;

@RestController
public class EmployeeLoginController {

	@Autowired
	private EmployeeLoginService service;

	@PostMapping("/employees/{employeeEmail}/{employeePassword}")
	public boolean employeeLogin(@PathVariable String employeeEmail, @PathVariable String employeePassword) {

		if (service.employeeLogin(employeeEmail, employeePassword) != null) {
			return true;
		}
		return false;
	}

}
