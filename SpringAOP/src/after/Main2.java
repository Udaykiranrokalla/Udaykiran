package after;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main2
{

	public static void main(String[] args) 
	{
		 Resource r=new ClassPathResource("applicationContext2.xml");
	       BeanFactory bf= new XmlBeanFactory(r);
	       A2 a=bf.getBean("proxy",A2.class);
	       a.m();

	}

}
