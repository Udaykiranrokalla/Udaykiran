package exercises;
import java.util.Scanner;
public class EvenNumbers 
   {
      public static void main(String[]args)
      {
    	  Scanner scan=new Scanner(System.in);
    	  int n;
    	  int i=1;
    	  System.out.println("please enter n value:");
    	  n=scan.nextInt();
    	  for (i=1;i<=2*n;i++)
    	  {
    		if(i%2==0)  
    	     System.out.printf("%d\n",i);
    	  }
      }
   }
