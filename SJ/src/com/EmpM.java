package com;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmpM {
	private JdbcTemplate jt1;
	

	public JdbcTemplate getJt1() {
		return jt1;
	}

	public void setJt1(JdbcTemplate jt1) {
		this.jt1 = jt1;
	}

	public List<Emp> fetch() {
	      String s = "select * from spring";
	      List <Emp> l= jt1.query(s,new Empl());
	      return l;
	   }
	}

