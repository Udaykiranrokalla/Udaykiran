package insert;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Select {

	JdbcTemplate jd4;
		
	public void setJd4(JdbcTemplate jd4) {
		this.jd4 = jd4;
	}
	public void select() {
		List l=jd4.queryForList("select * from mav ");
		Iterator i=l.iterator();
		while(i.hasNext()) {
		Object s=i.next();
		System.out.println(s.toString());
		}
	}
}
