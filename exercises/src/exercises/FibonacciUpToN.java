package exercises;
import java.util.Scanner;
public class FibonacciUpToN 
{
	
	 public static void main(String args[])
	 {
	         int i,c=0,n;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number ");
	     n=sc.nextInt();
	   int a=0;
	   int b=1;
	 
	 System.out.println("Fibonacci series upto "+n+" is :-");
	   while(c<=n)
	   {
	       System.out.print(c+" ");
	       a=b;
	       b=c;
	       c=a+b;
	   }
	 }
}


