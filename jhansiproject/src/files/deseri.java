package files;
import java.io.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class student implements deseri
	{
	public int a;
	public String s;
	transient int id;
	public student(int id,String s,int a)
	{
		this.a=a;
		this.s=s;
	    this.id=id;
	}
 public	class deseri
	{
		 public static void  main(String args[]) 
		 {	 
		 Student s=new Student(1,"hello", 1);
		 try
		 {
			FileInputStream fi=new FileInputStream("E:\\jkocherla\\jhansi.txt");
			ObjectInputStream oi=new ObjectInputStream(fi);
		   	Student =(Student)oi.readObject();
		    
		    System.out.println("deserialisation is completed");
		 }catch(Exception e)
		 {
			 System.out.println("object has been deserialised");
		 }
		 
	
		 
		 
	
	
