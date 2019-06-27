package javaproject;

import java.util.Scanner;

public class division {
	public static void main(String args[]) {
		System.out.println("enter two  numbers to check  divisible by 3 and 5");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		if(a%3==0 && b%5==0)
			System.out.println("numbers  divisible by 3 and 5");
		else
			System.out.println("hello man pls to check number");
}
}