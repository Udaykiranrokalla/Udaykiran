package After;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
public class Test {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("After.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Bone a=factory.getBean("proxy",Bone.class);  
    a.sub();  
}  
}