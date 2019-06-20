package Firstproject;

import java.util.Scanner;

public class Even1ton {
	public static void main(String arg[]) {
		Scanner scan=new Scanner(System.in);
		int n;
		int sum=0;
		int i;
		System.out.println("enter the number");
		n=scan.nextInt();
		for(i=1;i<=n;i++)
			if(i%2==0)
				sum=sum+i;
		System.out.println("sum="+sum);
		
	}

}
