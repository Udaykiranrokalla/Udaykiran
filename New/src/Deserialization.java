import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization 
{

	public static void main(String[] args)
	{
		try
		{
           FileInputStream fin=new FileInputStream("E:\\Harika\\file2.txt");
           ObjectInputStream ois=new ObjectInputStream(fin);
           Employee e=(Employee)ois.readObject();
           System.out.println(e.id+""+e.s+""+e.i+"");
           System.out.println("deserialised");
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}