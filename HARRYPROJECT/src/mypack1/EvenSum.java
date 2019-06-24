package mypack1;

import java.util.Scanner;

public class EvenSum    
{

	public static void main(String[] args)
	{
		System.out.println("enter a n value");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int	sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2 == 0)
               sum=sum+i;
		}
		System.out.println("sum="+sum);

 	}

}
