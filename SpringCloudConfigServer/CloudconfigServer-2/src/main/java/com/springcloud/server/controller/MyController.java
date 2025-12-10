package com.springcloud.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Value("${msg}")
	private String msg;
	
	@GetMapping("/get-timing")
	public String getCourseTiming() {
		return msg;
	}
}
