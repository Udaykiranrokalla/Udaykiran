package exercises;
import java.util.Scanner;
public class Divisible 
  {
	public static void main(String args[])
	 {
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("enter a number");
		a=scan.nextInt();
		if((a % 3==0) && (a % 5==0))
		{
			System.out.println("divisible by 3 and 5");
		}
		else
		{
			System.out.println("not divisible by 3 and 5");
		}
	 }
	

  }
