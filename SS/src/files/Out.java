package files;
import java.io.*;
public class Out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		try {
		FileOutputStream f=new FileOutputStream("D:\\g.txt");
		BufferedOutputStream b=new BufferedOutputStream(f);
		String s="Hello world";
		byte b1[]=s.getBytes();
		b.write(b1);
		b.flush();
		b.close();
		f.close();
		System.out.println("Success...");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}


}
