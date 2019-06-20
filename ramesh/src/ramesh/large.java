package ramesh;
import java.util.*;
public class large {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numbers");
		int n=sc.nextInt();
		int l=0,s=10,r=0;
		
		while(n>0) 
		{	
			r=n%10;
		if(r>l)
			l=r;
		if(r<s)
			s=r;
		n=n/10;;
		}

System.out.println("the largest number is:"+l);
System.out.println("the samllest number is"+s);
	}
}
