package insert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsertMain {

	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("entry.xml");  
	      
	    JDBCTemp dao=(JDBCTemp)ctx.getBean("jtemp");  
	    
	     dao.insert();
	     
	   
    }
}
