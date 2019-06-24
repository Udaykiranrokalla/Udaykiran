package mypack1;

import java.util.Scanner;

public class Perfect
{

	public static void main(String[] args)
	{
	  int sum=0;
	  System.out.println("enter a number");
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  for(int i=0;i<=n;i++)
	  {
		  if(n%i == 0)
		  {
			  sum=sum+i;
		  }
	  }
	  if(sum==n)
	  {
		  System.out.println("perfect number");
		  
	  }
	  else 
		  System.out.println("not a perfect number");

	}

}
