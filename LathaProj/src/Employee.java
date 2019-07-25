import java.io.Serializable;
 public class Employee implements Serializable{

	
		// TODO Auto-generated method stub
	

int id;  
String name;  
transient int age;
 }//Now it will not be serialized  

