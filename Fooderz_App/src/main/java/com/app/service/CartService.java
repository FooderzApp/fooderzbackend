package com.app.service;

import java.util.List;

import com.app.model.Cart;

public interface CartService {

	public Cart addFood(Cart cart);
	public List<Cart> getAllCart();
	public Cart getCartById(int id);
	public void DeleteCartById(int id);
	public List<Cart> getCartByCustomerId(int customerId);
}
