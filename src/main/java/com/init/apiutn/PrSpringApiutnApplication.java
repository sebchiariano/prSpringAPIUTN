package com.init.apiutn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.init.apiutn.products.rest.ProductsRest;

@SpringBootApplication
public class PrSpringApiutnApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrSpringApiutnApplication.class, args);
		
		ProductsRest p = new ProductsRest();
	}

}
