package com.init.apiutn.products.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/")
public class ProductsRest {
	
	
	//GET
	//o @GetMapping o ->
	//@GetMapping
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello world";
	}

}
