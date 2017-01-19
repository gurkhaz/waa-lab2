package com.lab.waa.persistance;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lab.waa.model.Product;

@Repository
public class InMemoryProductRepository implements ProductRepository {
	
	private final List<Product> listOfProduct;
	
	
	 public InMemoryProductRepository() {
		
		
		listOfProduct = new ArrayList<>();

		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		product1.setProductId("1");
		product1.setName("s7 mobile");
		product1.setDescription("New mobile in market");
		product1.setCategory("Electronics");
		product1.setUnitPrice(BigInteger.valueOf(700));
		product1.setUnitsInStock(12);
		product1.setManufacturer("samsung");
		
		product2.setProductId("2");
		product2.setName("Asus laptop");
		product2.setDescription("latest asus 5300 model");
		product2.setCategory("Electronics");
		product2.setUnitsInStock(32);
		product2.setUnitPrice(BigInteger.valueOf(500));
		product2.setManufacturer("Asus");
		
		product3.setProductId("3");
		product3.setName("watch");
		product3.setUnitsInStock(34);
		product3.setDescription("casio watch 2000");
		product3.setUnitPrice(BigInteger.valueOf(1200));
		product3.setManufacturer("Casio");
	
		
		listOfProduct.add(product1);
		listOfProduct.add(product2);
		listOfProduct.add(product3);
		
	}

	@Override
	public List<Product> getAllProducts() {
		
		return listOfProduct;

	}

}
