package javaproject;

import java.util.Scanner;

public class upper {
	public static void main(String args[]) {
		System.out.println("enter character upper case or lower case or digit or special character?:");
		Scanner obj=new Scanner(System.in);
		char ch=obj.next().charAt(0);
		if(ch >='a' && ch<='z') 
			System.out.println("u entered character");
		
		else if(ch >=0 &&  ch<=9)
			System.out.println("u entered the digit");
		else
			System.out.println("u entered the special character");
			
	}
			
}