package pack1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main 
{

	public static void main(String[] args)
	{
		 Resource r=new ClassPathResource("jdbc.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	        Insert in=(Insert)factory.getBean("id1");  
		    in.insert();  
	}
    
}
