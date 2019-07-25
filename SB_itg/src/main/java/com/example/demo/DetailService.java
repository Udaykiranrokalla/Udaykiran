package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;





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
	public List<Details> getDataById(int id)
	{
	
		List<Details> dbi = null;
		String query = "";
		query= "SELECT * FROM spring where id='"+id+"'";
		dbi=jdbt.query(query,new BeanPropertyRowMapper<Details>(Details.class));
		
		for (int i = 0; i < dbi.size();) 
		{
			Details e = new Details();
			e = (Details) dbi.get(i);
				i++;
		
	}
		return dbi;
}
	public int updateDetails(Details d1, int id) {
		int result = 0;
		String sql = "UPDATE spring SET name=?,age=? WHERE id = ? ";
		result = jdbt.update(sql, d1.getName(), d1.getAge(), id);
		System.out.println("result value====>" + result);
		return result;

	}

	public int deleteDetails(int id) {
		String query = "DELETE FROM spring WHERE ID =?";
		return jdbt.update(query, id);
	}


}
