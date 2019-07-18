import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Spring1 {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("java.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Pojo p=(Pojo)factory.getBean("p1");  
	    p.add();  
	}  
}
