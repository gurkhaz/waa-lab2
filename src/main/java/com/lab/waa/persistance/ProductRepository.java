package com.lab.waa.persistance;

import java.util.List;

import com.lab.waa.model.Product;

public interface ProductRepository {
	
	List<Product> getAllProducts();

	Product getProductById(String id);

}
