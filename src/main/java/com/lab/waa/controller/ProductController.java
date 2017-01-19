package com.lab.waa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lab.waa.model.Product;
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
	
	
	
	@RequestMapping(value = "/getProduct/processOrder", method = RequestMethod.POST  )
	public String processOrder(Model model, @RequestParam String productId, @RequestParam long qty){
		
		
		service.processOrder(productId, qty);
		model.addAttribute("products", service.getAllProducts());
		
		return "redirect:/products";
	}
	
	
	
	

}
