package Files;

import java.io.*;

public class Kiran {
	public static void main(String args[]) {
		try {
			 FileOutputStream fout=new FileOutputStream("E:\\kiran\\ud.txt"); 
			
	String s="udaykiran";
	byte b[]=s.getBytes();
	fout.write(b);
	fout.close();
		}
		catch(Exception e) {
	System.out.println(e);
	}
		System.out.println("success");
}
}