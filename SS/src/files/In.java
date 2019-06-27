package files;
import java.io.*;
public class In {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream f=new FileInputStream("D:\\g.txt");
		BufferedInputStream b=new BufferedInputStream(f);
		int i;
		while((i=f.read())!=-1) {
			System.out.print((char)i);
		}
		b.close();
		f.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
