package pack1;

import org.springframework.jdbc.core.JdbcTemplate;

public class Insert
{
	JdbcTemplate jt;

	public JdbcTemplate getJt() 
	{
		return jt;
	}

	public void setJt(JdbcTemplate jt) 
	{
		this.jt = jt;
	}
	void insert()
	{
		
		String s="Insert into stud22 values(50,'kusu')";
		int i=jt.update(s);
		System.out.println("inserted successful");
	}
	
 
}
