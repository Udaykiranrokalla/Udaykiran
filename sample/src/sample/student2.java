package sample;

public class student2 {
	int id,age;//local variable//
	
	String name;//local variable//
	
	
	Student2(int i,int a,String n){  
	    id = i;
	    age=a;
	    name = n;  
	    }  
	    Student2(){}  
	    void display(){
	    	System.out.println(id+" "+age+" "+name);}
	   
	    public static void main(String args[]){  
	    Student2 a = new Student2(14654781,80,"alekyaaa");  
	    Student2 b = new Student2();  
	    b.id=a.id;  
	    b.name=a.name;  
	    a.display();  
	    b.display();  
	   }  
	} 
	
	


