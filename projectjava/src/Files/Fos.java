package Files;
import java.io.*;
import java.io.FileOutputStream;
public class Fos{

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs=new FileOutputStream("D:\\Harish\\hari.txt");
			String s="harish";
			byte[] bytes = s.getBytes();
             fs.write(bytes);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		         

	}

}
