package com.example.demo;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@Autowired
Second s;
@RequestMapping(value="/insert",method=RequestMethod.POST,produces={org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
@ResponseBody
public String add(@RequestBody Pojo i) {
	if(s.adddetails(i)==1) {
		return"added sucessfully";
		
	}
	else {
		return "not entered";
	}
}
}
