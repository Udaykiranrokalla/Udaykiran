package abstractclass;
import java.util.Scanner;
abstract class A {
	   abstract void sum();
}
class B extends A
{
	void sum()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum of two numbers is  "+c);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A obj=new B();
		obj.sum();
}
}