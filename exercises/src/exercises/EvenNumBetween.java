package exercises;
import java.util.Scanner;
public class EvenNumBetween
    {
       public static void main(String args[])
       {
    	   Scanner scan=new Scanner(System.in);
    	   int n,sum=0;
    	   int i=1;
    	   System.out.println("enetr a value:");
    	   n=scan.nextInt();
    	   for(i=1;i<=n;i++)
    	   {
    		   if (i%2==0)
    			   sum=sum+i;
    	   }
    	   System.out.printf("sum="+sum);
       }
    }
