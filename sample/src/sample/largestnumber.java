	package sample;

import java.util.Scanner;

public class largestnumber {
	public static void main(String args[]) {
		int digit,num,max=0,min=10;
		System.out.println("enter  number");
		Scanner scr= new Scanner(System.in);
		digit=scr.nextInt();
		scr.close();
		while(digit>0)
		{
		num=digit%10;

		if(num>max) {
		max=num;
		}
		if(num<min)
		{
		min=num;

		}
		digit=digit/10;

		}
		System.out.println("max is"+max);
		System.out.println("min is"+min);
		}
		}


