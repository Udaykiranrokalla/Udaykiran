package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DetailController {
	@Autowired
	DetailService s;
@RequestMapping(value="/deleteitem/{sno}",method = RequestMethod.DELETE,produces = { MediaType.APPLICATION_JSON_VALUE })	
@ResponseBody
public int deleteFields(@PathVariable int sno) {
	int i=s.deleteDetails(sno);
	System.out.println("delete field"+i);
	return i;
}
@RequestMapping(value="/getDetails",method = RequestMethod.GET,produces = { MediaType.APPLICATION_JSON_VALUE })
@ResponseBody
public List<Details> getAllItems(){
    return s.getDetails();
}
@RequestMapping(value="/getDetails/{sno}",method = RequestMethod.GET,produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public  List<Details> getDetails(@PathVariable int sno) {
	List<Details> al= s.getDataById(sno);
	System.out.println(al);
	return al;
	}
@RequestMapping(value="/updateDetails/{id}",method = RequestMethod.PUT,produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public int updateDetails(@RequestBody Details d1, @PathVariable int id) {
	 int i =  s.updateDetails(d1, id);
	 System.out.println("i value====>"+i);
	 return i;
	}
}
