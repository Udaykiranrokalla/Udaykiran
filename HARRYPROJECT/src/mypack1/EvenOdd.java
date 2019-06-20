package mypack1;
import java.util.Scanner;
public class EvenOdd 
{
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		if(i % 2 == 0)
		{
			System.out.printf("%d is a even number",+i);
			
		}
		else
			System.out.printf("%d is odd number",+i);
	}
}


