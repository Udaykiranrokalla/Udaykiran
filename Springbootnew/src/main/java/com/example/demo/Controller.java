package com.example.demo;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

@RequestMapping(value="/update/{id}",method=RequestMethod.POST,produces= {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
@ResponseBody
public String update(@RequestBody Pojo i,@PathVariable int id) {
	int k=s.update(i,id);
	System.out.println("i value ====>"+k);
	return "data updated";
	
	
}
@RequestMapping(value="/delete/{id}",method=RequestMethod.POST,produces={org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
@ResponseBody
public String delete(@PathVariable int id) {
	int q=s.delete(id);
	System.out.println("i value==>"+q);
	return "deleted";
	}

@RequestMapping(value="/getdetails",method=RequestMethod.GET,produces= {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
@ResponseBody
public List<Pojo>getiteams(){
	return s.getdetails();
}
}