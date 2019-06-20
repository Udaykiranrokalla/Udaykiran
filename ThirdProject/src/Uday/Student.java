package Uday;

public class Student {
	int id,age,m1,m2,m3;
	String name;
    String company;
	public Student(int a,int b,int c,int d,int e,String n) {
		this.id=a;
		this.age=b;
		this.m1=c;
		this.m2=d;
		this.m3=e;
		this.name=n;
	}
	void average()
	{
		double z=0;
		z=(this.m1+this.m3+this.m3)/3;
		System.out.println("Average of the student "+this.name+"is" +z);
	}
	public static void main(String[] args) {
		Student S1=new Student(1,21,75,80,74,"uday");
		S1.average();
		System.out.println(S1.id);
		
	}
	
}
