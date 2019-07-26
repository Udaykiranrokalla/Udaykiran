package insert;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Updatemain {
	public static void main(String[] args) {  
	    Resource resource=new ClassPathResource("jd.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Update t=(Update)factory.getBean("id3");  
	    t.update();  
	}  
}

