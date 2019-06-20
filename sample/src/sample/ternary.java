package sample;

import java.util.Scanner;

public class ternary {
	public static void main(String args[])
	{
		int x,y,max;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		x=s.nextInt();
		y=s.nextInt();
	    max= (x>y)?x:y;
	    System.out.println("the greatest number among" + x + "and" + y + "is"+max+".");
	
	}
}


