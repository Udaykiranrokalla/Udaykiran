import java.io.*;
public class files {
	public static void main(String args[]) {
		try {
			FileOutputStream fout=new FileOutputStream("E:\\koti1.txt");    
			 fout.write(65);    
			 fout.close();
             System.out.println("success...");    
            }catch(Exception e)
		{
            	System.out.println(e);
            	}
		}
	}

