package methodinterceptor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main3
{

	public static void main(String[] args) 
	{
		Resource r=new ClassPathResource("applicationContext3.xml");
	       BeanFactory bf= new XmlBeanFactory(r);
	       A3 a=bf.getBean("proxy",A3.class);
	       a.m();
	}

}
