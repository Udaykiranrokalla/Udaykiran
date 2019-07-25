package pack2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main2
{

	public static void main(String[] args)
	{
		Resource r=new ClassPathResource("jdbc.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        Delete d=(Delete)factory.getBean("id2");  
	    d.delete();
	}

}
