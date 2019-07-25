package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class DetailService {
@Autowired
JdbcTemplate j;
public int deleteDetails(int sno){
String delete= "delete from student where sno=?";  
return j.update(delete,sno);
}
public List<Details> getDetails() {
	List<Details> details = j.query("select * from student", (result, rowNum) -> new Details(result.getInt("sno"),
			result.getString("sname"),result.getInt("age")));
	return details;
}
public List<Details> getDataById(int sno)
{

	List<Details> dbi = null;
	String query = "";
	query= "SELECT * FROM student where sno='"+sno+"'";
	dbi=j.query(query,new BeanPropertyRowMapper<Details>(Details.class));
	
	for (int i = 0; i < dbi.size();) 
	{
		Details e = new Details();
		e = (Details) dbi.get(i);
			i++;
	}
	return dbi;
}
public int updateDetails(Details d1, int sno) {
	int result = 0;
	String sql = "UPDATE student SET sname=?,age=? WHERE sno = ? ";
	result = j.update(sql, d1.getSname(), d1.getAge(), sno);
	System.out.println("result value====>" + result);
	return result;

}



}
