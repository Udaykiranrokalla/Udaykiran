package Firstproject;

import java.util.Scanner;

public class ThreeTenary {
	public static void main(String arg[]) {
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three numbers ");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		int max=(a>b&&a>c)?a:(b>c)?b:c;
		System.out.printf("big=%d",max);
	}

}
