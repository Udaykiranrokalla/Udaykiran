package rwo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMa {
	public static void main(String args[])
	{
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
    Emplogic ee=(Emplogic)ctx.getBean("id5");  
    List<Employee> l=ee.data();  
          
    for(Employee e:l)  
        System.out.println(e);  
}  
}  

