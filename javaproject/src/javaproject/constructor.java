package javaproject;

public class constructor {
	int id ,age,m1,m2,m3;
	String name;
	constructor(int a,int b,int c,int d,int e,String n) {
		this.id=a;
		this.age=b;
		this.m1=c;
		this.m2=d;
		this.m3=e;
		this.name=n;
		
	}
	void avarage() {
		double z = 0.0;
		z=(this.m1+this.m2+this.m3)/3.0;
		System.out.println("avarage of student "+this.name+"  "+z);
	}
	public static void main(String args[]) {
		constructor	 s1=new constructor(12,34,45,56,50,"koti");
		s1.avarage();
		
				
	}
}