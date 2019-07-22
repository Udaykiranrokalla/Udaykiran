package com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Empl implements RowMapper<Emp> {
	   public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		      Emp e = new Emp();
		      e.setId(rs.getInt(1));
		      e.setName(rs.getString(2));
		      e.setAge(rs.getInt(3));
		      return e;
		   }
		}
