import java.util.Scanner;
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1=0,t2=1,n,sum,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		System.out.println("First"+n+"terms:");
		 for ( i = 1; i <= n; ++i)
	        {
	            System.out.print(t1 + "  ");

	            sum= t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	}
}

