package curds;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

	public class Dele {
			public static void main(String[] args) {  
				
				ApplicationContext context =new ClassPathXmlApplicationContext("NewFile.xml");    
		    Delete d=(Delete)context.getBean("id3");  
		    d.delete();  
		    
		}  
		}  