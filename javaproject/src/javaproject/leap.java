package javaproject;

import java.util.Scanner;

public class leap {
	public static void main(String args[]) {
		System.out.println("enter the year to check leap year or not");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		if(a%400 ==0 && a%4 == 0)
			
			System.out.println("u entered awesome number ");
		else
			System.out.println("u check the  number ");
	}
}
