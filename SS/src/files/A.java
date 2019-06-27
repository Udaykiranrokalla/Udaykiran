package files;
import java.io.*;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fo=new FileOutputStream("D:\\gp.txt");
		fo.write(65);
		fo.close();
		System.out.println("Success....");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
