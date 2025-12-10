package com.example.serviceClint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {
	
	@Autowired
	private FeignClient feignClient;
	
	public String getCourseInfo() {
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8441/course-info", String.class);
//		return response.getBody()+ " Comming from another rest api";
		
		
	}
}
