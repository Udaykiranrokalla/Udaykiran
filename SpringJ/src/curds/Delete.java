package curds;
import org.springframework.jdbc.core.JdbcTemplate;

public class Delete {

			JdbcTemplate j;
			
			public JdbcTemplate getJ() {
				return j;
			}

			public void setJ(JdbcTemplate j) {
				this.j = j;
			}
			public void delete()
			{
			String s="delete from employee where id=101";
			int i=j.update(s);
			System.out.println("done");
			
				} 
				
			}
