package com.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerAPI {
	
	@GetMapping("/api")
	public String getMessage() {
		String msg="API Gate-Way";
		return msg;
	}

}
