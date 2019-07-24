package Demo1;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("After1.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    B b=factory.getBean("proxy",B.class);  
    b.m();  
}  
}