package comparpack;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

class Employee1
{  
    int id;  
    String name;  
    float sal;  
    public Employee1(int id, String name, float sal)
    {  
        this.id = id;  
        this.name = name;  
        this.sal = sal;  
    }  
}  
public class CompareById
{  
    public static void main(String[] args) 
    {  
        ArrayList<Employee1> l=new ArrayList<Employee1>();  
          
       
        l.add(new Employee1(1,"Harika",13000f));  
        l.add(new Employee1(4,"Alooo",12000f));  
        l.add(new Employee1(5,"Syamu",14000f));  
        l.add(new Employee1(3,"Latha",12000f));  
        l.add(new Employee1(2,"Jhansi",10000f));  
          
        System.out.println("Sorting by id");  
  
        Collections.sort(l,(e1,e2)->Integer.compare(e1.id, e2.id));
     
 
        for(Employee1 e:l)
        {  
            System.out.println(e.id+" "+e.name+" "+e.sal);  
        }  
  
    }  
}  