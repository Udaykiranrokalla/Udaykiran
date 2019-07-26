package insert;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Deletemain {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("jd.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Delete t=(Delete)factory.getBean("id4");  
	    t.delete();  
	}  
}
