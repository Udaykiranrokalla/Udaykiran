package Firstproject;

import java.util.Date;
import java.util.Scanner;

public class Numberofdays {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month number to get number of days");
		int month = scan.nextInt();
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		int numdays = 31;
		System.out.println("The number of days is :"+numdays);
		break;
		case 4:
		case 6:
		case 9:
		case 11:
		numdays = 30;

		System.out.println("The number of days is :"+numdays);
		break;
		case 2:
		System.out.println("Enter the year");
		int year = scan.nextInt();
		Date dat = new Date();
		year = dat.getYear();
		if(year % 4 == 0)
		numdays = 29;
		else
		numdays = 28;
		System.out.println("The number of days is :"+numdays);
		}
	}

}
