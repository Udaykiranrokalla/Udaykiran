package delete;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DeleteMain {


	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("entry.xml");  
	      
	    DeleteObj del=(DeleteObj)ctx.getBean("delete");  
	    
	    del.delete();
	   
    }
}
