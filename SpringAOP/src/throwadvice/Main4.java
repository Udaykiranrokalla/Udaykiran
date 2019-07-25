package throwadvice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import methodinterceptor.A3;


public class Main4
{

	public static void main(String[] args)
	{
		Resource r=new ClassPathResource("applicationContext4.xml");
	       BeanFactory bf= new XmlBeanFactory(r);
	       A4 a=bf.getBean("proxy",A4.class);
	       a.m(15);

	}

}
