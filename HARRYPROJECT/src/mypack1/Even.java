package mypack1;

import java.util.Scanner;

public class Even 
{

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter n value:");
		int n=scan.nextInt();
		for(int i=1;i<=2*n;i++)
		   if(i%2 == 0)
			   System.out.printf("%d\n",i);
		

	}

}
