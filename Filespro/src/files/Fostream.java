package files;

import java.io.FileOutputStream;

public class Fostream
{
	public static void main(String[]args)
	{
	  try
	  {    
          FileOutputStream fost=new FileOutputStream("D:\\rock\\fost.txt");    
          fost.write(69);    
          fost.close();    
          System.out.println("success...");    
         }
	  catch(Exception e)
	  {
        	 System.out.println(e);
        	 }    
   }    
}
