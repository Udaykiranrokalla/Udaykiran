package src.Files;
import java.io.*;
public class S implements Serializable {
static int id;
static String name;
public S(int id,String name) {
	this.id=id;
	this.name=name;
}

	public static void main(String args[]) throws Exception {
		S s=new S(1,"uday");
	FileOutputStream fout=new FileOutputStream("E:\\kiran\\kiran5.txt");
	ObjectOutputStream o=new ObjectOutputStream(fout);
	o.writeObject(s);
	FileInputStream fi=new FileInputStream("E:\\kiran\\kiran5.txt");
	ObjectInputStream out=new ObjectInputStream(fi);
	S s1 =(S)out.readObject();
    fi.close();
System.out.println("Object has been De-serialized"); 
System.out.println("id" +id);   
System.out.println("name:" +name); 
	}
}