package com.cap.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.demo.Entities.RawMAterialOrderEntity;
import com.cap.demo.Entities.RawMaterialSpecs;
import com.cap.demo.exception.UnsuccessfulOperation;
import com.cap.demo.service.DadServiceI;

@RestController
@CrossOrigin("http://localhost:4200")
public class DrinkAndDelightController {
	@Autowired
	DadServiceI service;
	@Autowired
	RestTemplate rest;
	 @GetMapping("getAll/{uid}") 
	  public List<RawMAterialOrderEntity> getAllOrders(@PathVariable int uid) throws Exception {
	
	   return service.getAllOrders(uid);
	  }
	@PostMapping("/orderCreation")
	public ResponseEntity<String> orderCreation(@RequestBody RawMAterialOrderEntity emp)
	{
		RawMaterialSpecs info=rest.getForObject("http://localhost:1111/getName/"+emp.getRmsid(),RawMaterialSpecs.class);
		if(info==null)
		{
			throw new UnsuccessfulOperation("unsuccesful in Creating order");
		}
		else
		{
			RawMAterialOrderEntity e=service.orderCreation(emp,info);
			ResponseEntity<String>responseEntity = new ResponseEntity<String>("Succefully ordered", HttpStatus.OK);
			return responseEntity;
		}
		
		
	}
	@GetMapping("/trackOrder/{oid}")
	public Object trackOrder(@PathVariable int oid)
	{
		return service.trackOrder(oid);
	}
	  
	  
}
