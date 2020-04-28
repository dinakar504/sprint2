package com.cap.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.Entities.RawMaterialSpecs;
import com.cap.demo.service.ServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class DrinkAndDelightController {
	@Autowired
	ServiceI service;
	  @GetMapping("getALlSPecs") 
	  public List<RawMaterialSpecs> getAllSpecs() throws Exception {
	System.out.println("");
	   return service.getallSpecs();
	  }  
	  @GetMapping("getName/{rmsid}") 
	  public RawMaterialSpecs getName(@PathVariable int rmsid) throws Exception {
	
	   return service.getSpec(rmsid);
	  } 
	 
}
