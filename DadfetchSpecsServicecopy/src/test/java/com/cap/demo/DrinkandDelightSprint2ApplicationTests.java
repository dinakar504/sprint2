package com.cap.demo;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.cap.demo.Entities.RawMaterialSpecs;

@SpringBootTest
class DrinkandDelightSprint2ApplicationTests {

	@Test
	void contextLoads() {
		
	}
	@Test
	void test1()
	{

		RestTemplate rest=new RestTemplate();
	List<RawMaterialSpecs> info=(List<RawMaterialSpecs>) rest.getForObject("http://localhost:1111/getALlSPecs",RawMaterialSpecs.class);

	     assertNotEquals(info,null );
	}

}
