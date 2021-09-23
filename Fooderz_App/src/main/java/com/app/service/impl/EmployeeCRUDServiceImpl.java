//package com.app.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.app.model.Employee;
//import com.app.repository.EmployeeRepository;
//import com.app.service.EmployeeCRUDService;
//
//@Service
//public class EmployeeCRUDServiceImpl implements EmployeeCRUDService {
//
//	@Autowired
//	private EmployeeRepository repository;
//
//	@Override
//	public Employee addEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		return repository.save(employee);
//	}
//
//	@Override
//	public List<Employee> getAllEmployees() {
//		// TODO Auto-generated method stub
//		return repository.findAll();
//	}
//
//	@Override
//	public void deleteEmployee(int id) {
//		// TODO Auto-generated method stub
//		repository.deleteById(id);
//	}
//
//}
