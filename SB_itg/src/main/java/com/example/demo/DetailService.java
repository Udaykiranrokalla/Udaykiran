package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;;

@Repository
public class DetailService {
	@Autowired
	JdbcTemplate jdbt;
	public List<Details> getDetails() {
		List<Details> details = jdbt.query("select * from spring", (result, rowNum) -> new Details(result.getInt("id"),
				result.getString("name"),result.getInt("age")));
		return details;

	}
	
	public int addDetails(Details d) {
		int id = d.getId();
		String name = d.getName();
		int age=d.getAge();
		String query = "INSERT INTO SPRING VALUES(?,?,?)";
		return jdbt.update(query, id, name, age);
	}

}
