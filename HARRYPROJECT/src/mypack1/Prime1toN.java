package mypack1;

import java.util.Scanner;

public class Prime1toN 
{

	public static void main(String[] args)
	{
		System.out.println("enter a number between 1 to n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			int prime=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j == 0)
					prime++;
			}
			if(prime == 2)
			   System.out.printf(" %d ",i);	
		}

	}

}
