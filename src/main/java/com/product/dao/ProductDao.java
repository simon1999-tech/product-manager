package com.product.dao;

import java.util.List;

import com.product.model.Product;

public interface ProductDao {
	
	public void addProduct(Product product);
	
	public void deleteProduct(int productId);
	
	public List<Product> getAllProduct();
	
	public Product getProduct(int productId);
	
}
