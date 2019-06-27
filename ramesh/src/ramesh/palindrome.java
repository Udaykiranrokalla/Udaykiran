package ramesh;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,r;
		int rev=0;
		System.out.println("enter a number");
		n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not apalindrome");
		}
	}

}
