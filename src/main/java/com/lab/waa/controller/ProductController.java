package com.lab.waa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lab.waa.service.OrderService;




@Controller
public class ProductController {

	@Autowired
	OrderService service;
	
	
	@RequestMapping(value = "/")
	public String getHome(){
		
		
		
		return "redirect:products";
		
	}
	
	

	@RequestMapping(value = "/products")
	public String getAllProducts(Model model) {

		model.addAttribute("products", service.getAllProducts());
		System.out.println("Here");
		return "product";

	}
	
	
	
	
	@RequestMapping(value = "/getProduct/{productId}")
	public String getPorductById(@PathVariable String productId,Model model){
		
		model.addAttribute("product", service.getProductById(productId));
		
		return "detail";
		
	}
	
	//@RequestMapping(value = "/getProduct/processOrder", )

}
