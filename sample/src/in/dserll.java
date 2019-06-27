package in;
import java.io.*;
public class dserll {
	
public static void main(String args[])throws Exception {
	try {
	FileInputStream al=new FileInputStream("d:/shetty.txt");  
	 
	  ObjectInputStream in=new ObjectInputStream(al);
	  
	  Sample s=(Sample)in.readObject();  
	  
	  System.out.println(s.id+" "+s.name);  
	  
	}catch(Exception e) {System.out.println(e);}

}
}
