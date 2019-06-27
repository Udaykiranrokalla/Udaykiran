package src;
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("enter two numbers");
	double a= scan.nextInt();
	double b= scan.nextInt();
	
	System.out.println("enter an operator(+,-,*,/):");
	char operator = scan.next().charAt(0);
	double res;
	switch(operator)
	{
	case '+':
		res = a+b;
		System.out.println("addition is" +res);
	case '-':
		res=a-b;
		System.out.println("subtraction is" +res);
	case '*':
		res=a*b;
		System.out.println("multiplication is" +res);
	case '/':
	   res=a/b;
	   System.out.print("division is" +res);
    default:
    	System.out.println("please enter given operand");
		   
	}
	
	
}
}
