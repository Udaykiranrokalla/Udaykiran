package Throwsadvice;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("ad.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    A a=factory.getBean("proxy",A.class);  
    try{  
    a.find(11);  
    }
    catch(Exception e) {
    	System.out.println(e);
    }
}  
}  