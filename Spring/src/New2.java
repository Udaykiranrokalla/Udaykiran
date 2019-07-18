import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class New2 {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("NewFile.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    New1 student=(New1)factory.getBean("student");  
	    student.add();  
	}  

}
