import java.util.Scanner;
public class EvenorOdd 
{
public static void main(String[] args)
{
	double number;
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a number ");
	number = scan.nextInt();
	if(number%2==0) {
		System.out.println("number is even");
		}
	else  {
		System.out.println("number is negative ");
	}
}
}

