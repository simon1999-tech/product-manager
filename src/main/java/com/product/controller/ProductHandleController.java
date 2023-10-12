package com.product.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.product.model.Product;
import com.product.service.ProductService;

@Controller
public class ProductHandleController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(path="handle-product", method=RequestMethod.POST)
	public RedirectView saveProduct(@ModelAttribute Product product,BindingResult result,HttpServletRequest request) {
		RedirectView view = new RedirectView();
		if(result.hasErrors()) {
			System.out.println("Wrong input");
			view.setUrl("/");
			return view;
		}
		this.productService.addProduct(product);
		view.setUrl(request.getContextPath()+"/");
		return view;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int id,HttpServletRequest request) {
		this.productService.deleteProduct(id);
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath()+"/");
		return view;
	}
	
}
