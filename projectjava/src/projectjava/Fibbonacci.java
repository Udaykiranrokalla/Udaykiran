package projectjava;
import java.util.*;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number to find fibbonacci");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,c,sum;
		System.out.println(a);
		System.out.println(b);
		for(c=2;c<=n;c++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
 
	}

}
