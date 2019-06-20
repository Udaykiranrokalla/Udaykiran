package Firstproject;

import java.util.Scanner;

public class Menudivencalculator {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		
		char repeat;
		do
		{
			System.out.println("1-Addition");
			System.out.println("2-Subtraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Division");
			System.out.println("What you want to perform....!");
			int option=scan.nextInt();
			System.out.println("Enter two numbers");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int result=0;
			switch(option)
			{
			case 1:result=a+b;
			System.out.println("the Addition is :"+result);
			break;
			case 2:result=a-b;
			System.out.println("The Subtraction is:"+result);
			break;
			case 3:result=a*b;
			System.out.println("the Multiplicaton is:"+result);
			break;
			case 4:result=a/b;
			System.out.println("the Division is:"+result);
			break;
			default:System.out.println("Invalid Option");
			break;
			}
			System.out.println("Do you want to continue(Y/N)");
			repeat=scan.next().charAt(0);
		}while(repeat!='n');
	}

			
		
		
	}


