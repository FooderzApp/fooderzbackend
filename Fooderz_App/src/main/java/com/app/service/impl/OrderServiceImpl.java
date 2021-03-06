package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.model.Order;
import com.app.repository.OrderRepository;
import com.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository repository;

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return repository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return repository.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Order> getOrderByCustomerId(int customerId) {
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		List<Order> orderList = repository.findOrderByCustomer(customer);
		return orderList;
	}

	@Override
	public List<Order> getOrderByOrderStatus(String orderStatus) {
		// TODO Auto-generated method stub
		return repository.findOrderByOrderStatus(orderStatus);
	}

	@Override
	public void deleteOrderById(int id) {
		// TODO Auto-generated method stub
		 repository.deleteById(id);
	}

}
