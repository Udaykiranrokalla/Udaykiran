import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Aldes 
{

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream f=new FileInputStream("E:\\Harika\\Student.txt");
			ObjectInputStream o=new ObjectInputStream(f);
			ArrayList al=(ArrayList).readObject();
	       // System.out.printf(s1.id+""+s1.name+""+s1.roll+"");
	       // System.out.printf(s2.id+""+s2.name+""+s2.roll+"");
	        //System.out.printf(s3.id+""+s3.name+""+s3.roll+"");
	       // System.out.printf(s4.id+""+s4.name+""+s4.roll+"");
		}
        catch(Exception e)
		{
        	System.out.println(e);
		}
	}

}
