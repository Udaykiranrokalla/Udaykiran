package in;
import java.io.*;

public class Serll  {
	
public static void main(String args[]) throws Exception{
	try {
	Sample a=new Sample(1752,"shetty"); 
	
	 FileOutputStream al=new FileOutputStream("d:/shetty.txt");  
	 
	  ObjectOutputStream out=new ObjectOutputStream(al);
	  
	  out.writeObject(a);
	  
	  out.flush(); 
	  
	  System.out.println("success");  
	 }  
	catch(Exception e) {
		System.out.println(e);
	}
}
}

