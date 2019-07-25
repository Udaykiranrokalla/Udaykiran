package pack2;

import org.springframework.jdbc.core.JdbcTemplate;

public class Delete
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
	void delete()
	{
		
		String s="delete from stud22 where id=5";
		int i=jt.update(s);
		System.out.println("deleted successful");
	}
}
