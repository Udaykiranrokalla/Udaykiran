import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
class Student implements java.io.Serializable
{
	int id;
	String name;
	int roll;
	Student(int id,String name,int roll)
	{
		this.id=id;
		this.name=name;
		this.roll=roll;
	}
	
}
public class AltoSeri
{

	public static void main(String[] args) 
	{
		
		Student s1=new Student(101,"harika",573);
		Student s2=new Student(102,"nikhil",567);
		Student s3=new Student(190,"frnduu",556);
		Student s4=new Student(102,"kusu",587);
		
		ArrayList al= new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		try
		{
		FileOutputStream f=new FileOutputStream("E:\\Harika\\Student.txt");
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(al);
		System.out.println("Array lis to Object Stream");
        }
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}
