package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeLoginService;

@Service
public class EmployeeLoginServiceImpl implements EmployeeLoginService {
	@Autowired
	private EmployeeRepository repository;

	@Override
	public boolean employeeLogin(String employeeEmail, String employeePassword) {

		return repository.existsByEmailAndPassword(employeeEmail, employeePassword);
	}

}
