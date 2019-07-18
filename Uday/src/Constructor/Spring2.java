package Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Spring2 {
public static void main(String args[]) {
	Resource resource=new ClassPathResource("java.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
    Con1 c=(Con1)factory.getBean("p2");
    c.display();
}
}
