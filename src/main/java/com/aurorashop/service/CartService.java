package com.aurorashop.service;

import java.util.List;

import com.aurorashop.model.Cart;

public interface CartService {

	public Cart saveCart(Integer productId, Integer userId);

	public List<Cart> getCartsByUser(Integer userId);

}