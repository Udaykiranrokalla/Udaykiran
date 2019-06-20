package Firstproject;

import java.util.Scanner;

public class Leapyear {
	public static void main(String args[]) {
		Scanner l=new Scanner(System.in);
		int y;
		System.out.println("enter a year");
		y=l.nextInt();
		if(y%4==0)
		{
			System.out.println("the year is leapyear");
		}
		else
		{
			System.out.println("the year is not leapyear");
		}
		
	}

}
