package querypack;
	import org.springframework.beans.factory.BeanFactory;

	import org.springframework.beans.factory.xml.XmlBeanFactory;
	import org.springframework.core.io.ClassPathResource;
	import org.springframework.core.io.Resource;

	public class Main 
	{

	public static void main(String[] args) 
	{
	   Resource resource=(Resource) new ClassPathResource("jdbc.xml");  
       BeanFactory factory=new XmlBeanFactory(resource);  
	   Query q=(Query)factory.getBean("id4");
	   q.fetch();

	}

	}

