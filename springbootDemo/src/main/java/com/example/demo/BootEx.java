package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootEx {
@RequestMapping("/hi")
	public int add()
{
	int a=1,b=2;
	return a+b;
}
}
