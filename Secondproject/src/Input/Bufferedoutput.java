package Input;

	

	import java.io.BufferedOutputStream;
	import java.io.FileOutputStream;

	public class Bufferedoutput {

		public static void main(String args[])throws Exception{
			FileOutputStream fout=new FileOutputStream("D:\\output\\ne.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s="Welcome to miracle.";
			byte b[]=s.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			fout.close();
			System.out.println("Honey is the best.........");
		}
		}





