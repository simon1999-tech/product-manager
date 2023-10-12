package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product.model.Product;
import com.product.service.ProductService;

@Controller
public class PageController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		List<Product> products = this.productService.getAllProduct();
		model.addAttribute("products", products);
		return "index";
	}
	
	@RequestMapping("/addproduct")
	public String addProductPage(Model model) {
		model.addAttribute("title", "Add product");
		return "addproduct";
	}
	
	@RequestMapping("/updateproduct/{productId}")
	public String updateProductPage(@PathVariable("productId") int id,Model model) {
		Product product = this.productService.getProduct(id);
		model.addAttribute("p", product);
		model.addAttribute("title", "Update Product");
		return "updateproduct";
	}
	
}
