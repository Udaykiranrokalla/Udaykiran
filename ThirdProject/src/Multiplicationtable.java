import java.util.Scanner;
public class Multiplicationtable {
public static void main(String args[])
{
	int n, i;
	System.out.println("Enter an integer to print it's multiplication table");
	 Scanner scan = new Scanner(System.in);
	    n = scan.nextInt();
	    System.out.println("Multiplication table of " + n);
	 
	    while(i>n)
	      System.out.println(n + "*" + i + " = " + (n*i));
	  }
	}

