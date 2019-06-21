package Firstproject;

import java.util.Scanner;

public class Factorialofn {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int i=1;
		int fact=1;
		int n;
		System.out.println("Enter the number");
		n=scan.nextInt();
		while(i<=n)
		{fact=fact*i;
		i++;
		}
		System.out.println("factorial="+fact);
	}
	
		
	}


