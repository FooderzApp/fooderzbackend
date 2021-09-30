package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Cart;
import com.app.model.Customer;
import com.app.repository.CartRepository;
import com.app.service.CartService;
@Service
public class CartServiceImpl implements CartService {

	
	@Autowired
	private CartRepository repository;
	
	@Override
	public Cart addFood(Cart cart) {
		// TODO Auto-generated method stub
	
		return repository.save(cart);
	}

	@Override
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cart getCartById(int id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).get();
	}

	@Override
	public void DeleteCartById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Cart> getCartByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setCustomerId(customerId);
		return repository.findCartByCustomer(customer);
	}

}
