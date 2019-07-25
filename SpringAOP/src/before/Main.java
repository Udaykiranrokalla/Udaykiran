package before;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main 
{

	public static void main(String[] args)
	{
       Resource r=new ClassPathResource("applicationContext.xml");
       BeanFactory bf= new XmlBeanFactory(r);
       A a=bf.getBean("proxy",A.class);
       a.m();

	}

}
