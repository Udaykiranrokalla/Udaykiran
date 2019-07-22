package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpE {
	public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     EmpM ee =(EmpM)context.getBean("id4");
     
    
     List<Emp> le = ee.fetch();
     
     for (Emp e1: le) {
        System.out.println("ID" + e1.getId()+ "Name" + e1.getName()+"Age" + e1.getAge());
     }  
  }
}
