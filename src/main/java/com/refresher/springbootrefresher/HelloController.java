package com.refresher.springbootrefresher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/")
	public String index() {
		return "Hello there from Spring Boot";
	}
}
