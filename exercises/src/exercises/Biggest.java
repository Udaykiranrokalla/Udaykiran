package exercises;
import java.util.Scanner;
public class Biggest {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a,b;
		System.out.println("enter two numbers");
	    a = scan.nextInt();
	    b= scan.nextInt();
	    if (a>b)
	    {
	    	System.out.println(a+ " is big");
	    }
	    else 
	    {
	    	System.out.println(b+ " is big");
	    }
	}

}
