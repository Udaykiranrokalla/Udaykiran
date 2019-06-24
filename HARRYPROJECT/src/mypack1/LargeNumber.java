package mypack1;

import java.util.Scanner;

public class LargeNumber 
{

	public static void main(String[] args)
	{	
		  int r,ln = 0;

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a Number :");
	        int n = sc.nextInt();

	        while (n > 0) 
	        {
	            r = n % 10;
	            if (ln < r)
	            {
	                ln = r;
	            }
	            n = n / 10;
	        }

	        System.out.println("\nThe Largest Digit is :" + ln);

	    }
	}

