import java.io.*;
public class FileOutputEx 
{

	public static void main(String[] args)
	{
		
     try {
		FileOutputStream fos=new FileOutputStream("E:\\latha\\myfile.txt");
		
     String s="miracle is college";
     byte b[]=s.getBytes();
     fos.write(b);
     
     fos.close();
     System.out.println("success");
	}
     catch(Exception e){
    	 System.out.println(e);
     }

}
}