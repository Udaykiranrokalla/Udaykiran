package src.Collections;
import java.util.*;
public class Student {
	 int no;
    String Ename;
Student(int id,String name) {
	this.no=id;
	this.Ename=name;
}
public static void main(String args[]) {
	ArrayList<Student> a=new ArrayList<Student>(); 
Student s=new Student(1,"uday");
Student s1=new Student(2,"kiran");
a.add(s);
a.add(s1);

//System.out.println(" " + Ename + no);
}
}
