package pack3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main3
{

	public static void main(String[] args) 
	{

		Resource r=new ClassPathResource("jdbc.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Update u=(Update)factory.getBean("id3");  
	    u.update();
	}

}
