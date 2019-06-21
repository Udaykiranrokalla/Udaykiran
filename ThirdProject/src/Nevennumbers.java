import java.util.Scanner;

public class Nevennumbers {
	public static void main(String[] args) {
		int n,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number:");
		n=scan.nextInt();
		for(i=1;i<=n;i++)
			if(i%2==0)
			{
		System.out.println("even numbers are " +i);
			}
}
}
