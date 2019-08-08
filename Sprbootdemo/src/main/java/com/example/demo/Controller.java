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
	Service se;
	@RequestMapping(value="/add",method=RequestMethod.POST,produces= {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	
	public String addStudent1(@RequestBody Sprdemo1 s)
	{
  if(se.addDetails(s)>=1) {
	  return "inserted";
  }
  else
  {
	  return "not inserted";
  }
	
}
}
