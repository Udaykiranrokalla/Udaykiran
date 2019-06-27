import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fi=new FileInputStream("E:\\Harika\\myfile.txt");    
        int i=fi.read();  
        System.out.print((char)i);    

	}

}
