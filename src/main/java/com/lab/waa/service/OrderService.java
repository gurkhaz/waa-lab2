package com.lab.waa.service;

import com.lab.waa.model.Product;

public interface OrderService {
	
	public void processOrder(String productId, int quantity);

	public Object getAllProducts();
	
	public Product getProductById(String id);


}
