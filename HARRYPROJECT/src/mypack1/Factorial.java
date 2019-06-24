package mypack1;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args)
	{
		int i=1,fact=1;
		System.out.println("enter a number for factorial");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		while(i<=n)
		{
			fact=fact*i;
			i=i+1;
		}
		System.out.println("factorial ="+fact);

	}

}
