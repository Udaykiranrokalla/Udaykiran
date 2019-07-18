package Constructor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Process {

	public static void main(String[]args)
	{
	    Resource resource=new ClassPathResource("NewFile.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	   Student sd=(Student)factory.getBean("sas");  
	    sd.show(); 
	}
}

