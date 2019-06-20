package Firstproject;

import java.util.Scanner;

public class evenorodd {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n;
		
		System.out.println("enter a number");
		n=s.nextInt();
		if(n%2==0) {
			System.out.println("the number is even");
	}
	
	else
	{
		System.out.println("the  number is odd");
	}
	}

}
