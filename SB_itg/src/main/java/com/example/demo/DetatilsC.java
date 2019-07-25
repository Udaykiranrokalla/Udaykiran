package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DetatilsC {
	@Autowired
    DetailService data;

    @RequestMapping(value="/getDetails",method = RequestMethod.GET,produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public List<Details> getAllItems(){
        return data.getDetails();
    }

    

    @RequestMapping(value="/add",method = RequestMethod.POST,produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public String addItem(@RequestBody Details i){
        if(data.addDetails(i)>= 1){
            return "Item Added Successfully";
        }else{
            return "Something went wrong !";
        }
    }
    @RequestMapping(value="/getDetails/{id}",method = RequestMethod.GET,produces = { MediaType.APPLICATION_JSON_VALUE })
   	@ResponseBody
   	public  List<Details> getDetails(@PathVariable int id) {
   	List<Details> al= data.getDataById(id);
   	System.out.println(al);
   	return al;
   	}

       

   	@RequestMapping(value="/updateDetails/{id}",method = RequestMethod.PUT,produces = { MediaType.APPLICATION_JSON_VALUE })
   	@ResponseBody
   	public int updateDetails(@RequestBody Details d1, @PathVariable int id) {
   	 int i =  data.updateDetails(d1, id);
   	 System.out.println("i value====>"+i);
   	 return i;
   	}
   	
   	@RequestMapping(value="/deleteitem/{id}",method = RequestMethod.DELETE,produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public int  deleteTopics(@PathVariable int id) {
	 int i = data.deleteDetails(id);
	 System.out.println("i value====>"+i);
	 return i;
	}
}
