package QueryList;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Select {
private JdbcTemplate j;

public JdbcTemplate getJ() {
return j;
}

public void setJ(JdbcTemplate j) {
this.j = j;
}
public void fetch() {
List l=j.queryForList("select * from employee");
   Iterator i=l.iterator();
   while(i.hasNext())
   {
	   System.out.println(i.next());
   }
}
}