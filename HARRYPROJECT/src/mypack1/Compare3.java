package mypack1;

import java.util.Scanner;

public class Compare3
{

	public static void main(String[] args)
	{
		System.out.println("enter 3 values");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int max=(a>b && a>c)?a:(b>c)?b:c;
		System.out.printf("big=%d",max);

	}

}
