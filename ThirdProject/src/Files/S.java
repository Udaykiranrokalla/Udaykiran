
import java.io.*;
public class S implements Serializable {
	int id;
String name;
public S(int id,String name) {
	this.id=id;
	this.name=name;
}



	public static void main(String args[]) throws Exception {
		S s=new S(1,"uday");
	FileOutputStream fout=new FileOutputStream("E:\\kiran\\kiran5.txt");
	ObjectOutputStream o=new ObjectOutputStream(fout);
	o.writeObject(s);
	//System.out.print("go");
	
	}
}