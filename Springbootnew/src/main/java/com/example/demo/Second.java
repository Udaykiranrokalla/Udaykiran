package com.example.demo;

import java.util.List;

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


public int update(Pojo f,int id) {
   int result=0;
   String sql="update employ  set name=? where id=?";
   result=j.update(sql,f.getName(),id);
   System.out.println("result"+result);
   return result;

		
	}
public int delete(int id) {
	String query="delete from employ where id=?";
	return j.update(query,id);
}
public List<Pojo>getdetails(){
	List<Pojo> l=j.query("select * from employ",(result,rowNum)->new Pojo(result.getInt("id"),result.getString("name")));
return l;


}
	
}

