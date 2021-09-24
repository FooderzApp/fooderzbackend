package com.app.service;

import com.app.model.Employee;

public interface EmployeeLoginService {

	public Employee employeeLogin(String employeeEmail, String employeePassword);
}
