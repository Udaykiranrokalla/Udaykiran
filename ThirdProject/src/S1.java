package src;
import java.io.*;
public class S1 implements Serializable {
	transient int id;
String name;
public S1(int id,String name) {
	this.id=id;
	this.name=name;
}
	public static void main(String args[]) throws Exception {
		S1 s=new S1(1,"uday");
	FileOutputStream fout=new FileOutputStream("E:\\kiran\\udaykiran.txt");
	ObjectOutputStream ot=new ObjectOutputStream(fout);
	ot.writeObject(s);
	FileInputStream fin=new FileInputStream("E:\\kiran\\udaykiran.txt");
	ObjectInputStream ot1=new ObjectInputStream(fin);
	S1 g=(S1)ot1.readObject();
	System.out.println(g.id+ "                                "+g.name);
	}
}