//package com.app.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.app.model.Employee;
//import com.app.repository.EmployeeRepository;
//import com.app.service.EmployeeLoginService;
//
//class EmployeeLoginControllerTest {
//	@Autowired
//	private EmployeeLoginService service;
//	@Autowired
//	private EmployeeLoginController controller;
//
//	@MockBean
//	private EmployeeRepository repository;
//
////	@Test
////	void testEmployeeLogin() {
////		Employee employee = new Employee(1, "Himanshu", "123456789", "hrj7292@gmail.com");
//////		String employeeEmail = "hrj7292@gmail.com";
//////		String employeePassword = "123456789";
////		when(repository.findByEmployeeEmailAndEmployeePassword(employee.getEmployeeEmail(), employee.getEmployeePassword()))
////				.thenReturn((Employee) Stream.of(new Employee(1, "Himanshu", "12345678", "hrj7292@gmail.com"))
////						.collect(Collectors.toList()));
////		assertEquals(1, service.employeeLogin(employee.getEmployeeEmail(),));
////
////	}
//
//	@Test
//	public void getAllEmployees() {
//		String employeeEmail = "hrj7292@gmail.com";
//		String employeePassword = "123456789";
//		when(repository.findByEmployeeEmailAndEmployeePassword(employeeEmail, employeePassword))
//				.thenReturn((Employee) Stream.of(new Employee(1, "Himanshu", "123456789", "hrj7292@gmail.com"))
//						.collect(Collectors.toList()));
//		assertEquals(1, repository.findByEmployeeEmailAndEmployeePassword(employeeEmail, employeePassword).si);
//	}
//}
