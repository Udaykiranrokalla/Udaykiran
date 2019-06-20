package mypack1;

import java.util.Scanner;

public class TernaryOperator
{

	public static void main(String[] args)
	{
		System.out.println("enter the values ");
		Scanner scan= new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int max=(a>b)?a:b;
		System.out.printf("biggest number=%d",max);

	}

}
