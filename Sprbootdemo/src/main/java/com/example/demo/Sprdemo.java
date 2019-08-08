package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sprdemo {
	
	@RequestMapping("/Data")
	public String add()
	{
		return  "hii";
	}

}
