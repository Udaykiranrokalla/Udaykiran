package mypack1;

import java.sql.Date;
import java.util.Scanner;

public class Days 
{

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter month number");
		int month=scan.nextInt();
		int numDays=0;
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays=30;
			break;
		case 2:
		   System.out.println("either 28 or 29 days ");
		   break;
		default:    
		  System.out.println("invalid month");
		} 

	}

}
