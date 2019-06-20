package exercises;
import java.util.Scanner;
public class LeapYear 
{
public static void main(String a[])
{
    System.out.println("enter a number");
	Scanner scan = new Scanner(System.in);
    int year = scan.nextInt();     
    if (year % 100 == 0)
    {
            if (year % 400 == 0 )
            {
	            System.out.println(" it is a LeapYear");
	        }
            else
            {
	           System.out.println("not a leapyear");
            }
    }       
    else if (year % 4 == 0)
     {
	    System.out.println("leapyear");
     }
     else 
     {
        	System.out.println("not a leap year :");
     }
}
}











