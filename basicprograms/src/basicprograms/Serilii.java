package basicprograms;
import java.io.*;
class Student implements Serializable{
	
	int eid;
	String name;
	int marks;
	public Student(int eid,String name, int marks){
		this.eid=eid;
		this.name=name;
		this.marks=marks;
	
}
}
public class Serilii {
	public static void main(String args[]) throws IO{
		Student s=new Student(123,"mss",33);
		FileOutputStream i=new FileOutputStream("E://GEt/serilization.txt");
		ObjectOutputStream o=new ObjectOutputStream(i);
		o.writeObject(s);
		o.flush();
		o.close();
		i.close();
		System.out.println("Sucess");
		
	}
	}

