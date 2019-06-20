package sample;

import java.util.Scanner;

public class divide3or5 {
	public static void main(String args[]) {
		Scanner d=new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=d.nextInt();
		if(n%3==0 && n%5==0)
		System.out.println("the number is divisible by 3 and 5");
		else
		System.out.println("the number is not divisible by 3 and 5");

		}
		
}
