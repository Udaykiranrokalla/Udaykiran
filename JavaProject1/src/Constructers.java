
public class Constructers {
	int id,age,m1,m2,m3; //instance variable
	String name;
	static String course;  //static variable
	public void get (int a , int b , int c ,int d , int e , String n ) 
	{
		this.id = a;
		this.age=b;
		this.m1=c;
		this.m2=d;
		this.m3=e;
		this.name=n;
	}
public void average()
{
double z= 0.0;
z = (this.m1 +this.m2+this.m3)/3.0 ;
System.out.print("average of this student" + this.name+ " is " +z);
}
public static void main(String args[])
{
	Constructers s1= new Constructers();
	s1.get (333,444,654,244,12,"nikhil");
	s1. average();
	
}
}
