package exercises;
import java.util.Scanner;
import java.math.*;
public class SumOfSeries {
	public static void main(String args[])
	{
	      int i=1;
	      int n,j;
	      double sum=0;
	      Scanner scan = new Scanner (System.in);
	      System.out.println("enter range you want to print");
	      n=scan.nextInt();
	    		 for (j=1;j<=n;j++)
	    		 {
	    		sum=sum+(1/Math.pow(2,j));	 
	    		 }
                   System.out.println("sum of series" + sum);	    		 
	    		 }
}