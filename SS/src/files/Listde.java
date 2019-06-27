package files;
import java.io.*;
import java.util.*;
public class Listde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	  FileInputStream fi=new FileInputStream("D:\\s.txt");
	  ObjectInputStream oi=new ObjectInputStream(fi);
	    
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
