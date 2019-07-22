package update;

import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateObj {

	private JdbcTemplate upd;

	
	

	public JdbcTemplate getUpd() {
		return upd;
	}




	public void setUpd(JdbcTemplate upd) {
		this.upd = upd;
	}




	void update()
	{
		String s="update studentzz set name='harish',branch='cse' where id=7";
		int u=upd.update(s);
		System.out.println("updated Successfully...");
	}
	
}
