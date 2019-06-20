package sample;

public class student2 {
	int id,age;//local variable//
	
	String name;//local variable//
	
	
	student2(int i,int a,String n){ 
	    id = i;
	    age=a;
	    name = n;  
	    }  
	student2(){}  
	    void display(){
	    	System.out.println(id+" "+age+" "+name);}
	   
	    public static void main(String args[]){  
	    	student2 a = new student2(14654781,80,"alekyaaa");  
	    	
	
	    a.display();  
	     
	   }  
	} 
	
	


