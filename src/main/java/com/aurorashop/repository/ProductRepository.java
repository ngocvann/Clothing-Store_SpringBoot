package com.aurorashop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aurorashop.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByIsActiveTrue();

	@Query("SELECT p FROM Product p WHERE p.category = :category")
	List<Product> findByCategory(@Param("category") String category);


}
