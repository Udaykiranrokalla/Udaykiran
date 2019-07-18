package settereg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterOb
{

	public static void main(String[] args) 
	{
		Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Vehicle v=(Vehicle)factory.getBean("veh");  
	    v.display();  
	}

}
