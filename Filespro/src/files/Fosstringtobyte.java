package files;
import java.io.FileOutputStream;
public class Fosstringtobyte {

	public static void main(String[]args)
	{
	  try
	  {    
          FileOutputStream fostsb=new FileOutputStream("D:\\rock\\fost.txt");    
          String s="Welcome to Rakesh world" ;
          byte b[]=s.getBytes();
          fostsb.write(b);
          fostsb.close();    
          System.out.println("success...");    
         }
	  catch(Exception e)
	  {
        	 System.out.println(e);
        	 }    
   }    
}

