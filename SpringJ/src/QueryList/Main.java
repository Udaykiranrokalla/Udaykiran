package QueryList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
public static void main(String[]args)
{
	Resource r=(Resource)new ClassPathResource("NewFile.xml");
	BeanFactory f=new XmlBeanFactory(r);
	Select s=(Select)f.getBean("id3");
	s.fetch();
	}

}
