package constructer;
import java.util.Scanner;
public class Student {

	
		int id,m1,m2,m3;
		String name,dept;
		Scanner sc=new Scanner(System.in);
		Student(int a,int b,int c,int d,String  s,String g)
		{
		   this.id=a;
		   this.m1=b;
		   this.m2=c;
		   this.m3=d;
		   this.name=s;
		   this.dept=g;
		}
		void total()
		{
			int total;
			total=this.m1+this.m2+this.m3;
			System.out.println("Total marks:"+total);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student obj=new Student(1,57,98,79,"hari","CSE");
			obj.total();
			
			
			
	}

}
