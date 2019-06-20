package Firstproject;

import java.util.Scanner;

public class Sumofn {
	public static void main(String arg[])
	{

	System.out.println("enter a number");
	Scanner scan = new Scanner(System.in);
	double i=1;
	double out = 0.0;double n;
	n = scan.nextInt();
	while(i<=n)
	{
	out = out+(1/i);
	i++;
	}
	System.out.println("the sum of series is"+out);
	}
	}


