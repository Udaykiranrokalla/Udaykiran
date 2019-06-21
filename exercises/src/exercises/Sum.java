package exercises;
import java.util.Scanner;
public class Sum {
	public static void main(String args[])
	{
	      int i=1;
	      int n,j;
	      float sum=0;
	      Scanner scan = new Scanner (System.in);
	      System.out.println("enter range you want to print");
	      n=scan.nextInt();
	    		 for (j=1;j<=n;j++)
	    		 {
	    		sum=sum+(i%j);	 
	    		 }
                   System.out.println("sum of series" + sum);	    		 
	    		 }
}