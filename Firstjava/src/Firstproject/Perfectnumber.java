package Firstproject;

import java.util.Scanner;

public class Perfectnumber {
			public static void main(String arg[]) {
			int n,sum=0;
			System.out.println("Enter the number:");
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			for(int i=1;i<=n/2;i++)
			{
			if(n%i==0)
			{
			sum=sum+i;
			}
			}
			if(sum==n)
			System.out.println("Number is perfect");
			else
			System.out.println("not perfect");
			}
			}

	


