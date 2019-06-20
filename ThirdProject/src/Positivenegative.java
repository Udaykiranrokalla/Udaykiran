import java.util.Scanner;
public class Positivenegative 
{
public static void main(String[] args)
{
	int number;
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a number ");
	number = scan.nextInt();
	if(number>0) {
		System.out.println("number is positive");
		}
	else  {
		System.out.println("number is negative ");
	}
}
}
