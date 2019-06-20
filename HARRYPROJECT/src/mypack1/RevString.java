package mypack1;

import java.util.Scanner;

public class RevString 
{

	public static void main(String[] args) 
	{
		System.out.println("enter string");
		Scanner scan = new Scanner(System.in);
		String s= scan.next();
		int len= s.length();
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

	}


