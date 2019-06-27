package javaproject;

import java.util.Scanner;

public class negative {
	public static void main(String args[]) {
		System.out.println("enter number to check whether number is positive or negative");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		if(a>0)
			System.out.println("number is positive ");
		else
			System.out.println("number is negative");
		
		
	}

}
