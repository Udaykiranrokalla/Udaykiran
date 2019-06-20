package ramesh;
import java.util.*;
public class large {
	public static void main(String[] args) {
		int l=0,s=10,r=0,n1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		while(n>0)
			r=n%10;
		if(n>l)
			l=r;
		if(r<s)
			s=r;
		n=n/100;;

System.out.println("the largest number is:"+l);
System.out.println("the samllest number is"+s);
	}
}
