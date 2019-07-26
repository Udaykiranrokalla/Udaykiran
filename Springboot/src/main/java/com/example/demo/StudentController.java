package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController		

public class StudentController {
	@Autowired
    StudentService ser;
	
	@RequestMapping(value="/add",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public String adddata(@RequestBody Student s){
        if(ser.addItem(s)>= 1){
            return " added";
        }
        else
        {
            return "not added ";
        }

}
	 @RequestMapping(value="/update/{id}",method = RequestMethod.POST,produces = { MediaType.APPLICATION_JSON_VALUE })
		@ResponseBody
		public void updateTopics(@RequestBody Student a1, @PathVariable String id) {
		 int i =  ser.updateItems(a1,id);
		 System.out.println("i value====>"+i);
		}
	    @RequestMapping(value="/delete/{id}",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE })
		@ResponseBody
		public void deleteTopics(@PathVariable String id) {
		 int i = ser.deleteItems(id);
		 System.out.println("i value====>"+i);
		}
	    @CrossOrigin
	    @RequestMapping(value="/get/{id}",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE })
		@ResponseBody
		public  List<Student> getItems(@PathVariable String id) {
		List<Student> al= ser.getItems(id);
		System.out.println(al);
		return al;
		}
	    @CrossOrigin
	    @RequestMapping(value="/getdata",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE })
	    @ResponseBody
	    public List<Student> getAllItems(){
	        return ser.getItems();
	    }

}