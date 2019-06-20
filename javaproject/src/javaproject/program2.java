package javaproject;

import java.util.Scanner;

public class program2 {
	public static void main(String args[]) {
	int count = 0;
		System.out.println("enter number");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=0;i<=n;i++) {
			
		if(n % i == 0)
		{
		count++;	
		}
		}
	if(count==2)
	System.out.println(" prime number");
System.out.println("not a prime number");
	}
}