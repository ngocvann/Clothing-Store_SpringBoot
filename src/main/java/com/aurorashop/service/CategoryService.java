package com.aurorashop.service;

import java.util.List;

import com.aurorashop.model.Category;

public interface CategoryService {

	public Category saveCategory(Category category);
	
	public Boolean existCategory(String name);
	
	public List<Category> getAllCategories();
	
	public Boolean deleteCategory(int id);
	
	public Category getCategoryById(int id);

	public Category findById(int categoryId);
	
	public List<Category> getAllActiveCategory();
}
