package files;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class  Student implements java.io.Serializable 
{
	public int id;
	public String s;
	 transient int a;
	public Student(int id, String s,int a)
	{
		this.id=id;
		this.s=s;
		this.a=a;
	}
	
}
public class Seri
{
	public static void main(String args[])
	{
		 Student s=new Student(1,"helloo",1);
		try
		{
			
		FileOutputStream fi=new FileOutputStream ("E:\\jkocherla\\jhansi.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fi);	
		oo.writeObject(s);
		System.out.println("serializable is completed");
		}
		catch(Exception e)
		{
			System.out.println("objects has been serialised");
		}
	}
}


