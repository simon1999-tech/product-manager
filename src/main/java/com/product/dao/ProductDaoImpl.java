package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.product.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void addProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}

	@Transactional
	public void deleteProduct(int productId) {
		Product pro = this.hibernateTemplate.get(Product.class, productId);
		this.hibernateTemplate.delete(pro);
	}

	public List<Product> getAllProduct() {
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}

	public Product getProduct(int productId) {
		Product product = this.hibernateTemplate.get(Product.class, productId);
		return product;
	}

}
