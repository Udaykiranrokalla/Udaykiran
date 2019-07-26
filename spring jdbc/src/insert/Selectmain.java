package insert;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Selectmain {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("jd.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Select s=(Select)factory.getBean("id5");  
	    s.select();  
	}  
}
