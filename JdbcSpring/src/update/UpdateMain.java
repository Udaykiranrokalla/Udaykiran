package update;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UpdateMain {
	public static void main(String args[]) {
	 ApplicationContext ctx=new ClassPathXmlApplicationContext("entry.xml");  
	 UpdateObj da=(UpdateObj)ctx.getBean("update"); 
	 da.update();
}
}