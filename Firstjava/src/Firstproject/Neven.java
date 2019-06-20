package Firstproject;

import java.util.Scanner;

public class Neven {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n;
		int i;
		System.out.println("Enter a number");
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.printf("The even numbers is %d\n",i);
			}
		}
	}

}
