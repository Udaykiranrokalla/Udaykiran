package collections;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import hariSerialize.Employee;

import java.io.Serializable;

class Student implements Serializable{  
	 public int rollno;  
	 public String name;  
	 public int age;  
	  public Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  
public class ObjCollecns {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(4511,"hari",21);
		Student s2=new Student(4512,"koti",21);
		Student s3=new Student(4511,"harika",21);
		Student s4=new Student(4511,"uday",21);

		ArrayList<Object> obj=new ArrayList<Object>();
		 obj.add(s1);
		 obj.add(s2);
		 obj.add(s3);
		 obj.add(s4);
		 try {
				FileOutputStream fs=new FileOutputStream("D:\\Harish\\Student.txt");
				ObjectOutputStream s=new ObjectOutputStream(fs);
				s.writeObject(obj);
				s.close();
				fs.close();
		        System.out.println("Object has been serialized"); 

				

			}
				catch(Exception e) {
					System.out.println(e);
				}
		 

			try {
		
		FileInputStream fi=new FileInputStream("D:\\Harish\\Student.txt");
		ObjectInputStream s=new ObjectInputStream(fi);
	ArrayList stud =(ArrayList)s.readObject();
	s.close();
	fi.close();
 System.out.println("Object has been De-serialized"); 
 Iterator it=stud.iterator();
 while(it.hasNext())
 {  
	 Student st= (Student)it.next();
	 System.out.println(st.rollno+" "+st.name+" "+st.age);
 }
 

 }
catch(Exception e)
			{
 System.out.println(e); 

			}
			
			

		

	}

}
