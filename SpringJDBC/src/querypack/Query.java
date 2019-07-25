package querypack;
import java.util.Iterator;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Query
{
    private JdbcTemplate jt;

   public JdbcTemplate getJt()
   {
     return jt;
   }

   public void setJt(JdbcTemplate jt)
   {
      this.jt = jt;
   }
   public void fetch()
   {
      List l=jt.queryForList("select * from stud22");
      Iterator i=l.iterator();
      while(i.hasNext())
      {
        Object o=i.next();
        System.out.println(o.toString());
      }
   }
}
