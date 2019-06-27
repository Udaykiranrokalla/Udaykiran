package in;
import java.io.*;
public class Finput {
public static void main(String args[]) {
	try {
		FileInputStream sl=new FileInputStream("D:\\samu.txt");
		int i=sl.read();
		System.out.println((char)i);
	
	sl.close();
	   System.out.println("resultsss") ;
    }catch(Exception e){System.out.println(e);}    
   }    
   
	
}

