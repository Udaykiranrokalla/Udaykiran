package mypack1;

import java.util.Scanner;

public class Biggest 
{

	public static void main(String[] args) 
	{
	   System.out.println("enter a number");
	   Scanner scan= new Scanner(System.in);
	   int a=scan.nextInt();
	   int b=scan.nextInt();
	   if(a>b)
	   {
		   System.out.printf(a + " is big");
	   }
	   else 
	   {	   
		   System.out.printf(b +"is big");
	   }
	}

}
