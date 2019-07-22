package select;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SelectObj {

	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("entry.xml");  
	      
	    SelectMain sel=(SelectMain)ctx.getBean("select");  
	    
	    sel.fetch();
	   
    }
}
