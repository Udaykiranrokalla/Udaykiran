package ContextApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Constructor.Student2;

public class EmpObj {
	public static void main(String[] args)
	{
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		 Employee s=(Employee)context.getBean("emp");  
         s.display();  
	}

}
