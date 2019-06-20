package mypack1;

import java.util.*;

public class PrimeNumber
{
     static int count;
	public static void main(String[] args)
	{   int j;
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<=n;i++)
		{
			count = 0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
				    count++;	
				}	
			}	
			if(count==2)
			{
				System.out.printf(" ",+i);
			}
		}
		}

	}


