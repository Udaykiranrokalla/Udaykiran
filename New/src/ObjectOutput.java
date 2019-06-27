import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutput 
{

	public static void main(String[] args)throws Exception
	{
		  String s =new String("harry");   
		  FileOutputStream fout=new FileOutputStream("E:\\Harika\\myfile1.txt"); 
		  ObjectOutputStream out=new ObjectOutputStream(fout);
		  out.writeObject(s); 
		  System.out.println("successful");  
	}

}
