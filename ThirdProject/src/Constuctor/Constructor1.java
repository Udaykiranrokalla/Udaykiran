package Constuctor;

public class Constructor1 {
		   int Id;  
		   String Name;  
			    
		   //parameterized constructor with two parameters
		   Constructor1(int id, String name){  
		       this.Id = id;  
		       this.Name = name;  
		   }  
		   void info(){
		        System.out.println("EId: "+Id+" EName: "+Name);
		   }  
			   
		   public static void main(String args[]){  
			Constructor1 obj1 = new Constructor1(10245,"Uday");  
			Constructor1 obj2 = new Constructor1(92232,"Kiran");  
			obj1.info();  
			obj2.info();  
		   }  
		}
