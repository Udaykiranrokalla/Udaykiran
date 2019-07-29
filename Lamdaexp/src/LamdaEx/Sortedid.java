package LamdaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
	class Employee1 {
		 int id;  
		    String name;  
		    float price;  
		    public Employee1(int id, String name, float price) {  
		        super();  
		        this.id = id;  
		        this.name = name;  
		        this.price = price;  
		    }  
		}  
	public class Sortedid{  
	    public static void main(String[] args) {  
	        List<Employee1> list=new ArrayList<Employee1>();  
	 
	        
	        //Adding Products  
	        list.add(new Employee1(1,"jhanu",25000f));  
	        list.add(new Employee1(3,"sandhya",300f));  
	        list.add(new Employee1(2,"mohan",15000f));
	        list.add(new Employee1(4,"sri",20000f));
	        list.add(new Employee1(5,"latha",30000f));
	          
	        System.out.println("Sorting on the basis of name...");  
	  
	        // implementing lambda expression  
	        Collections.sort(list,(p1,p2)->{  
	        return p1.id -(p2.id);  
	        });  
	        for(Employee1 e:list){  
	            System.out.println(e.id+" "+e.name+" "+e.price);  
	        }  
	  
	    }  
	} 

