package Firstproject;

import java.util.Scanner;

public class Numberofadigit {
public static void main(String arg[]) {
	Scanner scan=new Scanner(System.in);
	int n,count=0;
	int i=1;
	System.out.println("enter a number");
	n=scan.nextInt();
	while(i<=n)
	{
		n=n/10;
		count=count+1;
	}
	System.out.println("number of digits="+count);
	
		
	}
}

