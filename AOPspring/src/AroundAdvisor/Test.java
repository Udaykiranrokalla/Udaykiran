package AroundAdvisor;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("Application.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    RAM ram=factory.getBean("proxy",RAM.class);  
    ram.R();  
}  
}