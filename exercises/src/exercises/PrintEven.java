package exercises;
import java.util.Scanner;
public class PrintEven 
   {
     public static void main(String args[])
     {
    	 Scanner scan=new Scanner(System.in);
    int n;
    int i=1;
    System.out.println("please enter n value:");
    n=scan.nextInt();
    for(i=1;i<n;i=i+1)
    {
    	switch(i%2) 
    	{
    	case 0 : System.out.printf("the number % d is even \n" ,i);
           break;
    	case 1: System.out.printf("the number % d is even \n" ,i);
    	break;
    	
    	}
    }    		
     }
   }
