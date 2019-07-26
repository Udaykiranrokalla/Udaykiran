package After;


import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("ap.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    A a=factory.getBean("proxy",A.class);       
    a.sub(50,20);  
}  
}  