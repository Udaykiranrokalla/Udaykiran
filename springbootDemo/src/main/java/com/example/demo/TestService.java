package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class TestService {
	@Autowired
	JdbcTemplate jt;
public int addDetails(Sample s) {
	int a=s.getAge();
	String s1=s.getSname();
	int a1=s.getSno();
	String q="insert into student values(?,?,?)";
	return jt.update(q,a1,s1,a);
}
}
