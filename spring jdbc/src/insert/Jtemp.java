package insert;
import org.springframework.jdbc.core.JdbcTemplate;

public class Jtemp {

	JdbcTemplate jd;

		
	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}

	public void insert() {
		String s="insert into mav values(10,'teja','vizag')";
		int i=jd.update(s);
		System.out.println("inserted");
	}
	
}
