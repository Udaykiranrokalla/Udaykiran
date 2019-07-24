package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Second {
	@Autowired
	JdbcTemplate j;

public int adddetails(Pojo f) {
	int id=f.getId();
	String name =f.getName();
	
	
	String query="insert into employ values (?,?)";
	return j.update(query,id,name);
}
}
