package com.productapp;

import com.productapp.model.Product;
import com.productapp.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductAppRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppRestapiApplication.class, args);
	}

	private IProductService productService;

	@Autowired
	public void setProductService(IProductService productService) {
		this.productService = productService;
	}

	@Override
	public void run(String... args) throws Exception {
//		Product product = new Product();
//        product.setName("7 kgs front load washing machine");
//		product.setPrice(25000);
//		product.setBrand("LG");
//		product.setCategory("Appliances");
//		product.setRating(4.0);
//		product.setDescription("Front load machine");
//		product.setProductImg("/assets/appliances/machine1.jpg");
//		productService.addProduct(product);
	}
}
