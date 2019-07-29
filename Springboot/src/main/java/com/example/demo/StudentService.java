package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentService {

	@Autowired
	JdbcTemplate jd;

	public int addItem(Student s) {
		int i = s.getId();
		String n = s.getName();
		String p= s.getPlace();
		String s1 = "insert into mav values(?,?,?)";
		return jd.update(s1, i, n, p);
	}

	public int updateItems(Student s, String id) {
		int result = 0;
		try {
			String sql = "update mav set name=?,place=? WHERE id = ? ";
			
			result = jd.update(sql, s.getName(), s.getPlace(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 System.out.println("result value====>"+result);
		return result;
		
	}
	public int deleteItems(String id) {
		int result = 0;
		try {
			String sql = "delete from mav where id = ? ";
			
			result = jd.update(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("result value====>"+result);
		return result;
}
	public List<Student> getItems(String id)
	{
	
		List<Student> searchResults = null;
		String query = "";
		query= "SELECT * FROM mav where id='"+id+"'";
		searchResults=jd.query(query,new BeanPropertyRowMapper<Student>(Student.class));
		int i = 0;
		for (; i < searchResults.size();) 
		{
			Student e = new Student();
			e = (Student) searchResults.get(i);
				i++;
		
	}
		return searchResults;
}

	public List<Student> getItems() {
		List<Student> student = jd.query("select * from mav", (result, rowNum) -> new Student(result.getInt("id"),
				result.getString("name"), result.getString("place")));
		return student;                                                      

	}

}
