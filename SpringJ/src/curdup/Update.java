package curdup;
import org.springframework.jdbc.core.JdbcTemplate;

public class Update {

				JdbcTemplate j;
				
				public JdbcTemplate getJ() {
					return j;
				}

				public void setJ(JdbcTemplate j) {
					this.j = j;
				}
				public void upd()
				{
				String s="update employee set name=sairam where id=1";
				int i=j.update(s);
				System.out.println("done");
				}
				}
