package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
	
	@RequestMapping("/aad")
	public int add() {
		int a=10,b=10;
		return a+b;
	}
}
