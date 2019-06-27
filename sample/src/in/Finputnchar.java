package in;
import java.io.*;

public class Finputnchar {
public static void main(String arg[]) {
	try {
		FileInputStream hl=new FileInputStream("D:\\samu.txt");
		
		int i=0;    
        while((i=hl.read())!=-1){    
         System.out.print((char)i);    
        }    
        hl.close();    
      }catch(Exception e){System.out.println(e);}    
     }    
    
	
}

