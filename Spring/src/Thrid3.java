import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Thrid3 {
	public static void main(String args[]) {
		Resource resource=new ClassPathResource("NewFile.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Thrid a=(Thrid)factory.getBean("stu");
		a.thrid();
	
	
	
	
	}	

}
