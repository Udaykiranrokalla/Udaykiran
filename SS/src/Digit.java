import java.util.Scanner;
public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Sum of digits in a given number:"+count);

	}

}
