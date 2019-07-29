package lambdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Employee{  
    int id;  
    String name;  
    int salary;  
    public Employee(int id, String name, int salary) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.salary = salary;  
    }  
}  
public class LamdSortArrayList {

	public static void main(String[] args) {
		  List<Employee> list=new ArrayList<Employee>();  
            list.add(new Employee(1,"Latha",12000));  
	        list.add(new Employee(3,"Jhansi",10000));  
	        list.add(new Employee(2,"Harika",13000));  
	        list.add(new Employee(4,"GP",12000));  
	        System.out.println("Sorting Based on the name...");  
	         Collections.sort(list,(p1,p2)->{  
	        return p1.name.compareTo(p2.name);  
	        });  
	        for(Employee p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.salary);  
	        }  
	  
	    }  

		
	}


