package projectjava;
import java.util.*;
public class Leapyr {
    static int n;
	public static void main(String args[])
	{
		System.out.println("enter a year");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n % 400 == 0 )
        {
        	System.out.println("leap year");
        }
        else if(n % 100 == 0)
        {
        	System.out.println("not a leap year");
        }
        else if(n % 4 == 0)
        {
        	System.out.println("leap year");
        }
	}
	
}
