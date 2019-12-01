package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Product;

@Controller
public class ProductController {
     @GetMapping("/products")
	public String products(Model model) {
    	 model.addAttribute("products", getProductList());
    	 model.addAttribute("companyName", "LTI");
    	 
		return "productList";
		
	}
     public List<Product> getProductList(){
    	 List<Product> productList=new ArrayList();
    	 productList.add(new Product(1, "mouse", 1000.00, "afsf", new Date()));
    	 productList.add(new Product(2, "Keyboard", 2000.00, "afsf", new Date()));
    	 productList.add(new Product(3, "bluetooth", 3000.00, "afsf", new Date()));
    	 
		return productList;
    	 
     }
	
	
}
