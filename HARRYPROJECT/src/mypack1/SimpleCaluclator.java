package mypack1;

import java.util.Scanner;

public class SimpleCaluclator 
{



	public static void main(String[] args)
	{
	    System.out.println("\t MENU");
	    System.out.println("\t ADDITION");
	    System.out.println("\t SUBSTRACTION");
	    System.out.println("\t MULTIPLICATION");
	    System.out.println("\t DIVISION");
	    Scanner scan=new Scanner(System.in);
	    System.out.println("which operation need to be performed ");
	    char c=scan.next().charAt(0);
	    System.out.println("\t Enter 2 numbers");
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    int result=0;
	    switch(c)
	    {
	    case '+':
	         result=a+b;
	         System.out.println("Addition=" +result);
	         break;
	    case '-':
	    	 result=a-b;
	    	 System.out.println("Substraction=" +result);
	    	 break;
	    case '*':
	    	result=a*b;
	    	System.out.println("Multiplication=" +result);
	    	break;
	    case '/':
	    	result=a/b;
	    	System.out.println("Divison=" +result);
	    	break;
	    default:
	    	System.out.println("invalid operation");
	    }
	    

	}

}
