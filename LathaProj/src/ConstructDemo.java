import java.util.*;
public class ConstructDemo {
	int no,age,m1,m2;
	static String branch;
	public ConstructDemo(int id,int sage,int sm1,int sm2) {
		this.no=id;
		this.age=sage;
		this.m1=sm1;
		this.m2=sm2;
	}
	void avg()
	{
		double a=0.0;
		a=(this.m1+this.m2)/2.0;
		System.out.println("the average marks="+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructDemo.branch="cse";
       ConstructDemo s1=new ConstructDemo(1,18,85,95);
       s1.avg();
	}

}
