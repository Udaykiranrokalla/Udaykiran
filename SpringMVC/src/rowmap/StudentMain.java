package rowmap;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StudentMain {
public static void main(String args[]) {
	   ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-servlet.xml");  
	    StudentLogic dao=(StudentLogic)ctx.getBean("id3");  
	    List<Student> list=dao.data();  
	          
	    for(Student e:list)  
	        System.out.println(e);  
	}  
	}  