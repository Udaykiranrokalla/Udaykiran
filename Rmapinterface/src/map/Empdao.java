package map;

import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Empdao {  
 
JdbcTemplate jd;

public JdbcTemplate getJd() {
	return jd;
}

public void setJd(JdbcTemplate jd) {
	this.jd = jd;
}

public List<Student> data(){
	return jd.query("select * from mav",new RowMapper<Student>(){
		@Override
		 public Student mapRow(ResultSet rs, int rownumber) throws SQLException {  
	        Student s=new Student();  
	        s.setId(rs.getInt(1));  
	        s.setName(rs.getString(2));  
	        s.setPlace(rs.getString(3));  
	        return s;  
	    }  
	    });  
}
}