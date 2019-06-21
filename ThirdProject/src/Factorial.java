import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	int n,i=1;
	long factorial=1;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number to find its factorial");
	n=scan.nextInt();
	while(i<=n)
	{
	factorial *= i;
	i++;
	}
	System.out.println("fatorial of number is " +factorial);
}
}
