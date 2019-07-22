package delete;

import org.springframework.jdbc.core.JdbcTemplate;

public class DeleteObj {

	private JdbcTemplate del;

	public JdbcTemplate getDel() {
		return del;
	}

	public void setDel(JdbcTemplate del) {
		this.del = del;
	}
	
	void delete()
	{
		String s="delete from studentzz where id=7";
		int u=del.update(s);
		System.out.println("deleted Successfully...");
	}
}
