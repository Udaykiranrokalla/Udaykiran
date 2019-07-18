package Constructor;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Std2Obj {

	public static void main(String[] args)
	{
		  Resource r=new ClassPathResource("applicationContext.xml");  
          BeanFactory factory=new XmlBeanFactory(r);  
            
          Student2 s=(Student2)factory.getBean("s2");  
          s.print();  
	}
}
