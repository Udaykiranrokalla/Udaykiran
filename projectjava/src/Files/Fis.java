package Files;
import java.io.*;
import java.util.*;
import java.io.FileOutputStream;
public class Fis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fs=new FileInputStream("D:\\Harish\\hari.txt");
	        int s=fs.read();
	        while(s != (-0)){
	        	
				System.out.println((char)s);

	        }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
