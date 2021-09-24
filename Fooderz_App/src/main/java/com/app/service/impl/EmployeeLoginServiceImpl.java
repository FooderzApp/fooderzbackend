package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeLoginService;

@Service
public class EmployeeLoginServiceImpl implements EmployeeLoginService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee employeeLogin(String employeeEmail, String employeePassword) {



		Employee employee = repository.findByEmployeeEmailAndEmployeePassword(employeeEmail, employeePassword);
		if (employee != null) {
			return employee;
		}
		return null;

	}

}
