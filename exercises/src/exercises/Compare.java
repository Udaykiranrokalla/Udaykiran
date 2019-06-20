package exercises;
import java.util.Scanner;
public class Compare 
{
public  static void main(String args[])
   {
	Scanner scan= new Scanner(System.in);
	int a,b;
	System.out.println("eneter the values of a,b");
	a=scan.nextInt();
	b=scan.nextInt();
	int max=(a>b)?a:b;
	System.out.printf("big=%d",max);
   
   }
}
