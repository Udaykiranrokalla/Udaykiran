package files;
import java.io.*;
public class inputstream {

	public static void main(String[] args) {

		try
		{
			// TODO Auto-generated method stub
		 FileInputStream fin=new FileInputStream("E:\\jkocherla\\jhansi.txt");
          int i=fin.read();
          System.out.println((char)i);
	      fin.close();
		System.out.println("welcome to mss");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


	     


