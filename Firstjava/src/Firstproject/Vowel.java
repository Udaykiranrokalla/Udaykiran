package Firstproject;

import java.util.Scanner;

public class Vowel 
	{
	public static void main(String arg[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the char");
	char ch = scan.next().charAt(0);
	switch(ch)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	System.out.printf("vowel");break;
	default: System.out.printf("consonent");break;
	}

	}

}
