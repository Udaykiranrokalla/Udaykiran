package lambdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee1{  
    int id;  
    String name;  
    int salary;  
    public Employee1(int id, String name, int salary) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.salary = salary;  
    }  
}  
public class SortListById {
	public static void main(String[] args) {
		List<Employee1> list=new ArrayList<Employee1>();  
        list.add(new Employee1(1,"Latha",12000));  
        list.add(new Employee1(3,"Jhansi",10000));  
        list.add(new Employee1(2,"Harika",13000));  
        list.add(new Employee1(4,"GP",12000));  
        System.out.println("Sorting Based on the Id");  
         Collections.sort(list,(p1,p2)->{  
        return p1.id-(p2.id);  
        });  
        for(Employee1 p:list){  
            System.out.println(p.id+" "+p.name+" "+p.salary);  
        }  

	}

}
