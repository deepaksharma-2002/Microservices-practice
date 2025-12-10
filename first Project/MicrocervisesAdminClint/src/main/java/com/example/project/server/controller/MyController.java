package com.example.project.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/course-info")
	public ResponseEntity<String> getCourseInfo() {
		String info = "my firsr program";
		return new ResponseEntity<>(info, HttpStatus.OK);
	}
}
