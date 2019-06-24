package mypack1;

import java.util.Scanner;

public class Fibonacci
{

	public static void main(String[] args) 
 	{
		int i=1,c=0 ,a=0,b=1;
		System.out.println("enter till how many numbers");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(i<=n)
		{
			System.out.printf(""+c);
		    c=a+b;
			a=b;
			b=c;
			i++;
		}

	}

}
