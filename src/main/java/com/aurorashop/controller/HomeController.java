package com.aurorashop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.aurorashop.model.Category;
import com.aurorashop.model.Product;
import com.aurorashop.service.CategoryService;
import com.aurorashop.service.ProductService;
import com.aurorashop.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private UserService userService;
	
    @GetMapping("/")
    public String index() {
        return "index"; 
    }
    
    @GetMapping("/login")
    public String login() {
        return "login"; 
    }
    
    @GetMapping("/register")
    public String register() {
        return "register"; 
    }
    
    @GetMapping("/product")
    public String product(Model m, @RequestParam(value = "category", defaultValue = "") String category) {
        //System.out.println("Selected category: " + category);
        List<Category> categories = categoryService.getAllActiveCategory();
        List<Product> product = productService.getAllActiveProducts(category);
        //System.out.println("Products in category: " + (product != null ? product.size() : 0));
        m.addAttribute("categories", categories);
        m.addAttribute("product", product);
        m.addAttribute("paramValue", category);
        return "product"; 
    }

    
    @GetMapping("/view_product/{id}")
    public String view_product(@PathVariable int id, Model m) {
    	Product productById = productService.getProductById(id);
    	m.addAttribute("product", productById);
        return "view_product"; 
    }

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
