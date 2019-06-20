package exercises;
import java.util.Scanner;
public class Calculator {
	public static void main (String args[]) throws Exception
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("\t  MENU");
		System.out.println("\t [+] add");
		System.out.println("\t [-] sub");
		System.out.println("\t [*] multi");
		System.out.println("\t [/] div");
		System.out.println("\t  what you want to perform");
		char c=scan.next().charAt(0);
		System.out.println("enetr two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int result =0;
		switch(c)
		{
		case '+':
			result = a+b;
			System.out.println("result=" +result);
			break;
		case '-':
			result = a-b;
			System.out.println("result=" +result);
			break;
		case '*':
			result = a*b;
			System.out.println("result=" +result);
			break;
		case '/':
			result = a/b;
			System.out.println("result=" +result);
			break;
		default:
			System.out.println("invalid operation");
		}
		
	}
}
