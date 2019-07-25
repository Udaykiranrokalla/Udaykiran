package com;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;  
public class Test1
{
	public static void main(String[] args) 
	{  
	    Resource r= new ClassPathResource("applicationContext.xml");
	    BeanFactory b=new XmlBeanFactory(r);
	  Student s=(Student) b.getBean("id1");
	  List<StudentPojo> ls =s.data();
	  for(StudentPojo ss:ls) 
	  {
		  System.out.println(ss);
	  }
	}
}
	   


