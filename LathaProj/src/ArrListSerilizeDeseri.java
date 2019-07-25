import java.io.*;
import java.util.*;
 class Student implements Serializable{
     int no,age;
     String name;
     Student(int no,int age,String name){
    	 this.no=no;
    	 this.age=age;
    	 this.name=name;
     }
}
public class ArrListSerilizeDeseri {
public static void main(String args[]) {
	Student s1=new Student(1,21,"latha");
	Student s2=new Student(2,21,"hari");
	Student s3=new Student(3,22,"hari");
	Student s4=new Student(4,21,"janu");
	ArrayList al=new ArrayList();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	try {
		FileOutputStream fs=new FileOutputStream("E:\\latha\\arrserlize.txt");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(al);
		os.close();
		fs.close();
		System.out.println("ArrayList serialized");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	try {
		FileInputStream fi=new FileInputStream("E:\\latha\\arrserlize.txt");
		ObjectInputStream oo=new ObjectInputStream(fi);
		ArrayList stud=(ArrayList)oo.readObject();
	     oo.close();
	     fi.close();
	     System.out.println("completly deserialized");
	     Iterator it=stud.iterator();
	     while(it.hasNext()) {
	    	Student st=(Student)it.next();
	    	System.out.println(st.no+" "+st.name+" "+st.age);
	     }
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
