import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class practice {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("NewFile.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Project1 p=(Project1)factory.getBean("ram");  
	    p.display();  
	    
	}  
	}  