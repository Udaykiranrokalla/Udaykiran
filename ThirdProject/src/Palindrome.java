import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	System.out.println("enter a number to check whether it is palindrome or not");
	Scanner in =new Scanner(System.in);
	int n=in.nextInt();
	int sum=0,r;
	int temp=n;
	while(n>0)
	{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
	}
	if(temp==sum)
		System.out.println("it is a palindrome number");
		else
			System.out.println("it is not a palindrome number");
		
}
}
