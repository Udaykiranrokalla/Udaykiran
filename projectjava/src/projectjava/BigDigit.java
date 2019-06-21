package projectjava;
import java.util.*;
public class BigDigit {
	
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int big=0,r;
		while(n>0)
		{
			r=n%10;
			if(r>big)
			{
				big=r;
			}
			n=n/10;
		}
		System.out.println("big is "+big);
				
				
	}

}
