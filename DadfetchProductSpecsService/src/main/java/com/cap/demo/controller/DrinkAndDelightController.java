package com.cap.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.Entities.ProductSpecs;
import com.cap.demo.service.ServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class DrinkAndDelightController {
	@Autowired
	ServiceI service;
	  @GetMapping("getAllProductSpecs") 
	  public List<ProductSpecs> getAllSpecs()  {
	
	   return service.getallSpecs();
	  }  
	  @GetMapping("getName/{rmsid}") 
	  public ProductSpecs getName(@PathVariable int rmsid) {
	
	   return service.getSpec(rmsid);
	  } 
	  @PostMapping("postPRoduct")
	  public void product(@RequestBody ProductSpecs product)
	  {
		  service.postProduct(product);
	  }
	 
}
