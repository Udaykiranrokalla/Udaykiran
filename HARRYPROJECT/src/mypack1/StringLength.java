package mypack1;

import java.util.Scanner;

public class StringLength
{

	public static void main(String[] args) 
	{
		int i=0;
		System.out.println("enter a string");
		Scanner scan= new Scanner(System.in);
		String s =scan.next();
		for(char c:s.toCharArray())
		{
			i++;
		}
		System.out.println("length="+i);

	}

}
