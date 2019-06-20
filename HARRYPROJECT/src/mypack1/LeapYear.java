package mypack1;

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args)
	{
		System.out.println("enter a year to check it is leap year or not");
		Scanner scan = new Scanner(System.in);
		int year= scan.nextInt();
		 if(year%4 == 0)
		{
			System.out.println("leap year");
		}
		else 
		{
			System.out.println("not a leap year");
		}
	}

}
