import org.springframework.jdbc.core.JdbcTemplate;  

public class DataDao {
	JdbcTemplate jb;
	public JdbcTemplate getJb() {
		return jb;
	}

	public void setJb(JdbcTemplate jb) {
		this.jb = jb;
	}
	public int addData(Data d) {
		String sql="insert into Emp99(name,salary,designation) values('"+d.getId()+"',"+d.getName()+",'"+d.getAge()+"')";    
	    return jb.update(sql);

}

}
