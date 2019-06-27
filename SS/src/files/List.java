package files;
import java.io.*;
import java.util.*;
class Student implements Serializable
{
	int i;
	String s;
	public Student(int a,String b)
	{
		this.i=a;
		this.s=b;
	}
}
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1=new Student(1,"Gp");
       Student s2=new Student(2,"Harish");
       Student s3=new Student(3,"harry");
       ArrayList al=new ArrayList();
       al.add(s1);
       al.add(s2);
       al.add(s3);
       
      try {
    	  FileOutputStream f1=new FileOutputStream("D:\\s.txt");
    	  ObjectOutputStream o=new ObjectOutputStream(f1);
    	  o.writeObject(al);
    	  o.flush();
    	  o.close();
    	  f1.close();
    	  System.out.println("Success...");
      }
      catch(Exception e)
      {
    	  System.out.println(e);
      }
	}

}
