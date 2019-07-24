package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;;

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

}
