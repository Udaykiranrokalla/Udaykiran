import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutput 
{

	public static void main(String[] args)throws Exception
	{   
	            FileOutputStream fout=new FileOutputStream("E:\\Harika\\myfile1.txt");    
	            BufferedOutputStream bo=new BufferedOutputStream(fout);
	            String s="Hello world";
	            byte b[]=s.getBytes();
	            bo.write(b); 
	            System.out.println("successful");    
	        }    
}




