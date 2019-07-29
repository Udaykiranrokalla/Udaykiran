package comparpack;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

class Employee
{  
    int id;  
    String name;  
    float sal;  
    public Employee(int id, String name, float sal)
    {  
        this.id = id;  
        this.name = name;  
        this.sal = sal;  
    }  
}  
public class Compare
{  
    public static void main(String[] args) 
    {  
        ArrayList<Employee> l=new ArrayList<Employee>();  
          
       
        l.add(new Employee(1,"Harika",13000f));  
        l.add(new Employee(4,"Alooo",12000f));  
        l.add(new Employee(5,"Syamu",14000f));  
        l.add(new Employee(3,"Latha",12000f));  
        l.add(new Employee(2,"Jhansi",10000f));  
          
        System.out.println("Sorting by name");  
  
     
        Collections.sort(l,(e1,e2)->{
        	return e1.name.compareTo(e2.name);
        	});  
        
        for(Employee e:l)
        {  
            System.out.println(e.id+" "+e.name+" "+e.sal);  
        }  
  
    }  
}  