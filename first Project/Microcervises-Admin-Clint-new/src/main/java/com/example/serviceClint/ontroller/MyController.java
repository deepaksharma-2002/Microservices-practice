package com.example.serviceClint.ontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviceClint.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	private MyService myService;
	
	@GetMapping("course-details")
	public ResponseEntity<String> orderInfo(){
		String str = myService.getCourseInfo();
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}
}
