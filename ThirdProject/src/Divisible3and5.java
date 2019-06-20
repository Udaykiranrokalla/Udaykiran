import java.util.Scanner;
public class Divisible3and5
{
public static void main(String[] args)
{
	double number;
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a number ");
	number = scan.nextInt();
	if(number%3==0 && number%5==0) {
		System.out.println("number is divisible");
		}
	else  {
		System.out.println("number is not divisible ");
	}
}
}

