package com.lab.waa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.waa.model.Product;
import com.lab.waa.persistance.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void processOrder(String productId, long quantity) {


		Product orderedProduct =  productRepository.getProductById(productId);
		System.out.println(productId);
		System.out.println(quantity);
		System.out.println(orderedProduct);
		
		if(orderedProduct !=null)
		{
			if(quantity < orderedProduct.getUnitsInStock())
			{
				orderedProduct.setUnitsInStock(orderedProduct.getUnitsInStock()-quantity);
				System.out.println("service page");
			}
			else
			{
				throw new IllegalArgumentException();
			}
		}
		

	}

	public Product getProductById(String id) {

		//
		// for(Product pr : productRepository.getAllProducts()){
		// if(id.equals(pr.getProductId())){
		//
		// }
		//
		// }
		/*List<Product> aa = productRepository.getAllProducts().stream().filter(a -> a.getProductId().equals(id))
				.collect(Collectors.toList());

		return aa.size() > 0 ? aa.get(0) : null;*/
		
		return productRepository.getProductById(id);

	}

	public List<Product> getAllProducts() {

		return productRepository.getAllProducts();
	}

}
