package Firstproject;

import java.util.Scanner;

public class Multiplicationtable {
	public static void main(String arg[]) {
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.println("enter a number");
		n=scan.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(n+"*"+i+"="+(n*i));
		
		
	}

}
