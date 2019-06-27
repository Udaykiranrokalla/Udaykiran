package in;
import java.io.*;
public class Foutstri {

	public static void main(String args[]){    
        try{    
          FileOutputStream sa=new FileOutputStream("D:\\sam.txt");
          
          String s="syamu is a pretty girl";    
          byte b[]=s.getBytes();
          sa.write(b);    
          sa.close();    
          System.out.println("good"); 
          
         }catch(Exception e){System.out.println(e);}    
   }    
}  	 



