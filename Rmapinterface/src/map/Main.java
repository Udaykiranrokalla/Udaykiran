package map;

import java.util.List;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String args[])
	{
		Resource resource=new ClassPathResource("appcon.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);
    Empdao ed=(Empdao)factory.getBean("id2");  
    List<Student> l=ed.data();  
          
    for(Student s:l)  
        System.out.println(s);  
}  
}  
