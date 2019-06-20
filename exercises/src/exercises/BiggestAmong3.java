package exercises;
import java.util.Scanner;
public class BiggestAmong3 {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("enter three numbers");
	    a = scan.nextInt();
	    b= scan.nextInt();
	    c=scan.nextInt();
	    d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	    System.out.println("Largest Number:"+d);
    }
}