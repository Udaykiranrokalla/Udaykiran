package Firstproject;

import java.util.Scanner;

public class Ternary {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	System.out.println("enter two numbers");
	a = sc.nextInt();
	b = sc.nextInt();
	int max = (a>b) ? a:b;
	System.out.printf("big=% d",max);
	}
	
	
}

