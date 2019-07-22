package insert;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemp {

private JdbcTemplate jdbc;

	
public JdbcTemplate getJdbc() {
	return jdbc;
}



public void setJdbc(JdbcTemplate jdbc) {
	this.jdbc = jdbc;
}



void insert()
{
	String s="insert into studentzz values(7,'dhoni','wkc')";
	int i=jdbc.update(s);
	System.out.println("inserted Successfullyy...");
	
}


}
