package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Cart;
import com.app.service.CartService;

@RestController
@CrossOrigin
public class CartController  {

	@Autowired
	private CartService service;
	
	@PostMapping("/cart")
	public Cart addFood(@RequestBody Cart cart) {
		// TODO Auto-generated method stub
		return service.addFood(cart);
	}

	@GetMapping("/cart")
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return service.getAllCart();
	}

	@GetMapping("/cart/{id}")
	public Cart getCartById(int id) {
		// TODO Auto-generated method stub
		return service.getCartById(id);
	}

}