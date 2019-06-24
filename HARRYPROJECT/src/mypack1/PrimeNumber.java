package mypack1;

import java.util.*;

public class PrimeNumber
{
 
	public static void main(String[] args)
	{  
	    int count = 0;
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count=1;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Prime number");
		}
		else
			System.out.println("Not a prime number");
		}

	}


