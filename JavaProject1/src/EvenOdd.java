import java.util.Scanner;

public class EvenOdd
{
public static void main(String args[])
{
	Scanner scan=new Scanner (System.in);
	int numbers;
	System.out.println("enter a number:");
	int number=scan.nextInt();
	if (number % 2==0)
	{
		System.out.printf("%d is even number",+number);
	}
	else
	{
		System.out.printf("%d is odd number",+number);
}
}
}
