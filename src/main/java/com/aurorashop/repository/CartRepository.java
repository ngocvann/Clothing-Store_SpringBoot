package com.aurorashop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurorashop.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

	public Cart findByProductIdAndUserId(Integer productId, Integer userId);

}