package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerEx {
@Autowired
	TestService ts;
@RequestMapping(value="/add",method=RequestMethod.POST,produces= {MediaType.APPLICATION_JSON_VALUE})
@ResponseBody
public String addStudent(@RequestBody Sample s) {
	if(ts.addDetails(s)>=1) {
		return "details added successfully";
	}
	else
	{
		return "wrong";
	}
}
}
