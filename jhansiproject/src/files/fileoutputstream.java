package files;
import java.io.*;
public class fileoutputstream {
public static void main(String args[])
{
	try {
		FileOutputStream fout = new FileOutputStream("E:\\jkocherla\\jhansi.txt");
	 String s="welcome to miracle";
	 byte b[]=s.getBytes();
	 fout.write(b);
	 fout.close();
	
System.out.println("success");
	}
catch(Exception e)
	{
	System.out.println(e);
	}
}
}


