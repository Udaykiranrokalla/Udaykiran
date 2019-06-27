package src.Files;

import java.io.FileInputStream;

public class Udaykiran {
 public static void main(String args[]) {
		try {
		FileInputStream fin = new FileInputStream("E:\\kiran\\kiran1.txt\\");
		int i=0;
	while((i=fin.read())!=-1) {
	System.out.println((char)i);
	}
	fin.close();
	}
	catch(Exception e) {
	System.out.println(e);
	}
    	}
}
