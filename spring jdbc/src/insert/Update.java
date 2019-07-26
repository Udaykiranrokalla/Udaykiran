package insert;

import org.springframework.jdbc.core.JdbcTemplate;

public class Update {

	JdbcTemplate jd1;

		
	public void setJd1(JdbcTemplate jd1) {
		this.jd1 = jd1;
	}
	public void update() {
		String s1="update  mav set name='kiran',place='vizag' where id=8";
		int j=jd1.update(s1);
		System.out.println("updated");
	}
}
