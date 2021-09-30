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

import com.app.model.Customer;
import com.app.repository.CustomerRepository;
import com.app.service.CustomerService;

@RunWith(SpringRunner.class)
@SpringBootTest
class CustomerControllerTest {
	@Autowired
	private CustomerService service;

	@MockBean
	private CustomerRepository repository;

	@Test
	void testAddCustomer() {

		Customer customer = new Customer(1, "Kesa", "Gaurav", "kg42@gmail.com", "qwertyuiop");
		when(repository.save(customer)).thenReturn(customer);
		assertEquals(customer, service.addCustomer(customer));
	}

	@Test
	void testDeleteCustomer() {
		Customer customer = new Customer();
		customer.setCustomerId(1);
		service.deleteCustomer(customer.getCustomerId());
		verify(repository, times(1)).deleteById(customer.getCustomerId());
	}

	@Test
	void testGetAllCustomers() {
		when(repository.findAll()).thenReturn(Stream
				.of(new Customer(1, "Satish", "Ikkurthi", "satish112@gmail.com", "qwertyuiop"),
						new Customer(2, "Vinay", "Singh", "vs234@gmail.com", "123456789"))
				.collect(Collectors.toList()));
		assertEquals(2, service.getAllCustomers().size());
	}

}
