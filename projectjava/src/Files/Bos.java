package Files;
import java.io.*;

public class Bos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs=new FileOutputStream("D:\\Harish\\harish.txt");
			BufferedOutputStream bf = new BufferedOutputStream(fs);
			String s="welcome to miracle software systems";
			byte[] bytes = s.getBytes();
             bf.write(bytes);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("successull");

	}

}
