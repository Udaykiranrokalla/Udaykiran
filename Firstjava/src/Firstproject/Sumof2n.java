package Firstproject;

import java.util.Scanner;

public class Sumof2n {
	public static void main(String arg[])
	{
	Scanner scan = new Scanner(System.in);
	double i=0,n,a;
	System.out.println("enter the number");
	double sum = 0.0;
	n = scan.nextInt();
	while(i<=n)
	{
	a=Math.pow(2,i);
	sum = sum+(double)(1.0/a);
	i++;
	}
	System.out. println("the sum of series =" +sum);
	}
	
	}
	


