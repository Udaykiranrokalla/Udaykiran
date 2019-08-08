package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class Service {
	@Autowired
	JdbcTemplate j;
	public int addDetails(Sprdemo1 s)
	{
	int id=s.getId();
	String name=s.getName();
	String branch=s.getBranch();
	String query="insert into student1 values(?,?,?)";
	return j.update(query,id,name,branch);
		
	}

}
