package data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;  

public class DataDao {
	JdbcTemplate jb;
	public JdbcTemplate getJb() {
		return jb;
	}

	public void setJb(JdbcTemplate jb) {
		this.jb = jb;
	}
	public int addData(Data d) {
		String sql="insert into spring(id,name,age) values('"+d.getId()+"',"+d.getName()+",'"+d.getAge()+"')";    
	    return jb.update(sql);

}

	public List<Data> getData() {
		return jb.query("select * from spring",new RowMapper<Data>(){    
	        			@Override
			public Data mapRow(ResultSet rs, int row) throws SQLException {
				  Data e=new Data();    
		            e.setId(rs.getInt(1));    
		            e.setName(rs.getString(2));    
		           e.setAge(rs.getInt(3));
		                  return e;    
			}    
	    });    
	}

}
