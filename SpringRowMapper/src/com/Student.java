package com;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Student
{
		private JdbcTemplate jt;  
		  
		

        public JdbcTemplate getJt() {
			return jt;
		}



		public void setJt(JdbcTemplate jt) {
			this.jt = jt;
		}



		public List<StudentPojo> data()
        {  
		 return jt.query("select * from stud22",new RowMapper<StudentPojo>()
		 {  
		    @Override  
		    public StudentPojo mapRow(ResultSet rs, int rownumber) throws SQLException 
		    {  
		        StudentPojo st=new StudentPojo();  
		        st.setId(rs.getInt(1));
		        st.setName(rs.getString(2));
		        return st;  
		    }  
		 });  
		}  
}  

	
