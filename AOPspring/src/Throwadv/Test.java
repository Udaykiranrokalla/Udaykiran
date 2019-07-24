package Throwadv;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[]args)
	{
		Resource r=new ClassPathResource("Application.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Validator v=bf.getBean("proxy",Validator.class);
		try
		{
			v.Validate(12);
		}
		catch(Exception e) {e.printStackTrace();}
		}
	}

