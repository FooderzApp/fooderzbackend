package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.EmployeeCRUDService;

@RestController
public class EmployeeCRUDController {

	@Autowired
	private EmployeeCRUDService service;

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return service.addEmployee(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return service.getAllEmployees();
	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteEmployee(id);
	}

}
