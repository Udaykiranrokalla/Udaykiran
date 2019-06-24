                                                             package mypack1;

public class Constructer 
{

	int id,age,m1,m2,m3; // instance var
	java.lang.String name;
	static String course; //static var
	Constructer(int a,int b,int c,int d,int e,java.lang.String string)
	{
		this.id=a;
		this.age=b;
		this.m1=c;
		this.m2=d;
		this.m3=e;
		this.name=string;
	}
	public void average()
	{
		double z=0.0;    //local var
		z = (this.m1+this.m2+this.m3)/3.0;
		System.out.println("average of student" + this.name + "is"+z);
	}
	public void hello()
	{
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		Constructer c=new Constructer(1, 2,3, 4, 5, "go");
		c.average();
		c.hello();
	}
}
