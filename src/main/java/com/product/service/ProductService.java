package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.model.Product;
@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void addProduct(Product product) {
		this.productDao.addProduct(product);
	}
	
	public void deleteProduct(int productId) {
		this.productDao.deleteProduct(productId);
	}
	
	public List<Product> getAllProduct(){
		return this.productDao.getAllProduct();
	}
	
	public Product getProduct(int productId) {
		return this.productDao.getProduct(productId);
	}
	
}
