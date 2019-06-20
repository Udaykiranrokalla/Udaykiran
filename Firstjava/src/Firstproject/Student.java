package Firstproject;

public class Student {
	int id,age,m1,m2,m3;
	String name;
	static String course;
	public Student(int a,int b,int c,int d,int e,String n)
	{
		this.id=a;
		this.age=b;
		this.m1=c;
		this.m2=d;
		this.m3=e;
		this.name=n;
	}
	void average()
	{
		int z=0;
		z=(int) ((this.m1+this.m2+this.m3)/3.0);
		System.out.println("Average of this student"+this.name+"is"+z);
	}
	public static void main(String args[])
	{
		Student s1=new Student(511,22,89,94,76,"abc");
		Student s2=new Student(511,22,89,94,76,"abc");
		s1.average();
		s2.average();
		System.out.println(s1.id);
		

}
}