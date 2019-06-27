import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class Employee implements java.io.Serializable
{
	public int id;
	String s;
	transient int i;
}
public class Serializable
{
   
	public static void main(String[] args)
	{
		try
		{
	    Employee e=new Employee();
	    e.id=573;
	    e.s="harry";
	    e.i=1;
		FileOutputStream fout= new FileOutputStream("E:\\Harika\\file2.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(e);
		System.out.println("Serialized");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
