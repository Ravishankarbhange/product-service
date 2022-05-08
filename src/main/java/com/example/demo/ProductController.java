package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductRepository prepo;	
	
	@PostMapping("/addproduct")
    public ProductMaster addproduct(@RequestBody ProductMaster product) {
		return prepo.save(product);
    }
	
	@GetMapping("/details")
	public Iterable<ProductMaster> getProductDetails(){
		return prepo.findAll();
	}
	
	@GetMapping("/detail/{productId}")
	public Optional<ProductMaster> getProductDetails(@PathVariable Long productId) {
	    return prepo.findByProductid(productId);
	}
	    
	@GetMapping("/remove/{productId}")
	 public boolean removeProductDetail(@PathVariable Long productId) {
	    Optional<ProductMaster> product=this.getProductDetails(productId);
	    if(product.isPresent()){
	        prepo.delete(product.get());
	        return true;
	    }else {    		
	    	return false;
	    }
	 }
}
