package mypack1;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args)
	{
		String sdd="";
		System.out.println("enter a string");
		Scanner scan= new Scanner(System.in);
		String s= scan.next();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			sdd= sdd+s.charAt(i);
		}		
		if(sdd.equals(s))
		{
			System.out.println("palindrome");
		}

	}

}
