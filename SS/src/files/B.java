package files;
import java.io.*;
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fi=new FileInputStream("D:\\gp.txt");
		int i=fi.read();
		System.out.println((char)i);
		fi.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
