package rowmap;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;






public class StudentLogic {
	 JdbcTemplate t;    
	public void setT(JdbcTemplate t) {
		this.t = t;
	}
	
		//return t.query("select * from student", new Row)
		public List<Student> data(){  
			 return t.query("sql", new RowMapper<>() {
			    @Override  
			    public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
			        Employee e=new Employee();  
			        e.setId(rs.getInt(1));  
			        e.setName(rs.getString(2));  
			        e.setSalary(rs.getInt(3));  
			        return e;  
			    }  
			    });  
		}  

		}  
