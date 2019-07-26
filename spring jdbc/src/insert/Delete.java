package insert;

import org.springframework.jdbc.core.JdbcTemplate;

public class Delete {

	JdbcTemplate jd2;

		
	public void setJd2(JdbcTemplate jd2) {
		this.jd2 = jd2;
	}


	public void delete() {
		String s="delete from  mav where id=8";
		int i=jd2.update(s);
		System.out.println("deleted");
	}
	
}
