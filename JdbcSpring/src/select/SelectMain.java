package select;

import java.awt.List;
import java.util.Iterator;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class SelectMain {

	private JdbcTemplate sel;

	public JdbcTemplate getSel() {
		return sel;
	}

	public void setSel(JdbcTemplate sel) {
		this.sel = sel;
	}
	
	void fetch()
	{
		List l = (List) sel.queryForList("select * from studentzz");
		Iterator it = ((java.util.List<Map<String, Object>>) l).iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o.toString());
		} 
	}
}
