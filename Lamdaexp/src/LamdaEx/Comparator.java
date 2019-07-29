package LamdaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Employee {
	 int id;  
	    String name;  
	    float price;  
	    public Employee(int id, String name, float price) {  
	        super();  
	        this.id = id;  
	        this.name = name;  
	        this.price = price;  
	    }  
	}  
public class Comparator{  
    public static void main(String[] args) {  
        List<Employee> list=new ArrayList<Employee>();  
 
        
        //Adding Products  
        list.add(new Employee(1,"jhanu",25000f));  
        list.add(new Employee(3,"sandhya",300f));  
        list.add(new Employee(2,"mohan",15000f));  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        });  
        for(Employee e:list){  
            System.out.println(e.id+" "+e.name+" "+e.price);  
        }  
  
    }  
}  
