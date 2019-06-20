package mypack1;

import java.util.Scanner;

public class PositiveNegative 
{
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>0)
		{
			System.out.println("positivgve number");
			
		}
		else
			System.out.println("Negative number");
	}

}
