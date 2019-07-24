package curd;

import org.springframework.jdbc.core.JdbcTemplate;

public class Insert {
	
	JdbcTemplate j;
	
	public JdbcTemplate getJ() {
		return j;
	}

	public void setJ(JdbcTemplate j) {
		this.j = j;
	}
	public void insert()
	{
	String s="insert into employee values(101,'sunil')";
	int i=j.update(s);
	System.out.println("done");
	
		} 
		
	}
