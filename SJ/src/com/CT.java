package com;
import org.springframework.jdbc.core.JdbcTemplate;

public class CT {
	JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
		public void insertRow()
		{
			String s="insert into spring values(1,'saradhi',22)";
			int k = jt.update(s);
			System.out.println(k+ " row(s) inserted");
		}
	
}
