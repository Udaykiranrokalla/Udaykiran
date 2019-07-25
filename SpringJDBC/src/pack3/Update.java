package pack3;

import org.springframework.jdbc.core.JdbcTemplate;

public class Update
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
	void update()
	{
		
		String s="update stud22 set name='roja' where id=5";
		int i=jt.update(s);
		System.out.println("updated successful");
	}
}
