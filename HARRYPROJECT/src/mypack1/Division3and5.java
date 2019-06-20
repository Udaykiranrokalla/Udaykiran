package mypack1;

import java.util.Scanner;

public class Division3and5
{

	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		if((a % 3 == 0) && (a % 5 == 0))
		{
			System.out.println("divisible by both");
		}
		else 
		  System.out.println("not divisible by the both");	
		

	}

}
