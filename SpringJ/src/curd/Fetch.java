package curd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

public class Fetch {

			public static void main(String[] args) {  
				
				ApplicationContext context =new ClassPathXmlApplicationContext("NewFile.xml");    
				Insert in=(Insert)context.getBean("id3");  
				in.insert();  
		    
		}  
		}  
