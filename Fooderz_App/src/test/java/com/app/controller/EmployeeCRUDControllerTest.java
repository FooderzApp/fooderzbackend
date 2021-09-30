package com.app.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeCRUDService;

@SpringBootTest
@RunWith(SpringRunner.class)
class EmployeeCRUDControllerTest {

	@Autowired
	private EmployeeCRUDService service;

	@MockBean
	private EmployeeRepository repository;

	@Test
	public void addEmployee() {
		Employee employee = new Employee(2, "Himanshu", "12345678", "hrj7292@gmail.com");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, service.addEmployee(employee));
	}

	@Test
	public void addEmployee1() {
		Employee employee = new Employee(1, "Kesa Gaurav", "qwertyuiop", "kg42@gmail.com");
		when(repository.save(employee)).thenReturn(employee);
		assertEquals(employee, service.addEmployee(employee));
	}

	@Test
	void testGetAllEmployees() {
		when(repository.findAll())
				.thenReturn(Stream
						.of(new Employee(1, "Himanshu", "12345678", "hrj7292@gmail.com"),
								new Employee(2, "Kesa Gaurav", "qwertyuiop", "kg42@gmail.com"))
						.collect(Collectors.toList()));
		assertEquals(2, service.getAllEmployees().size());
	}

	@Test
	void testDeleteEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeId(1);
		service.deleteEmployee(employee.getEmployeeId());
		verify(repository, times(1)).deleteById(employee.getEmployeeId());
	}

}
