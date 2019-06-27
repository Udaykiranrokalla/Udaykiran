package files;

import java.io.*;

public class Bostream {
	public static void main(String[]args)throws Exception
	{
	  try
	  {    
          FileOutputStream fost=new FileOutputStream("D:\\rock\\fostbost.txt");  
          BufferedOutputStream Bost=new BufferedOutputStream(fost);
          String s="Rakesh is the game changer";   
          byte b[]=s.getBytes();
          Bost.write(b);
          fost.close();    
          Bost.close();
          System.out.println("success...");    
         }
	  catch(Exception e)
	  {
        	 System.out.println(e);
        	 }    
   }    
}
