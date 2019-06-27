package in;
import java.io.*;
public class Foutput {
public static void main(String args[]) {
	try {
	FileOutputStream sm=new FileOutputStream("D://syam.txt");
	sm.write(75);
	sm.close();
	System.out.println("valueabe");
	}catch(Exception e){System.out.println(e);}
	
	
	
}
}
