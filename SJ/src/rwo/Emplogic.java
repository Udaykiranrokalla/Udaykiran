package rwo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Emplogic {
	private JdbcTemplate t;  
	  
	
	  
	public void setT(JdbcTemplate t) {
		this.t = t;
	}



	public List<Employee> data(){  
	 return t.query("select * from spring",new RowMapper<Employee>(){  
	    @Override  
	    public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
	        Employee e=new Employee();  
	        
	        e.setId(rs.getInt(1));
	        e.setName(rs.getString(2));  
	        e.setAge(rs.getInt(3));
	        return e;  
	    }  
	    });  
	}  
	}  