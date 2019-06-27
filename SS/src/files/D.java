package files;
import java.io.*;
class E implements Serializable
{
	private static final long serialversionUID =129348938L; 
	int id;
	transient int num;
	String name;
	public E(int a,int b,String c)
	{
		this.id=a;
		this.num=b;
		this.name=c;
	}
}
public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e1=new E(1,121,"harry");
		
		try {
			FileOutputStream f=new FileOutputStream("D:\\n.txt");
			ObjectOutputStream o1=new ObjectOutputStream(f);
		 o1.writeObject(e1);
		 o1.flush();
		 o1.close();
		 f.close();
		 System.out.println("success..");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
