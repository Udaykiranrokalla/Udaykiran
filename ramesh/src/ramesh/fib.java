package ramesh;
import java.util.*;
public class fib {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	
	int i=0;
	int a=0,b=1,c;
	for(i=1;i<=n;i++)
	{
		System.out.println("fibonacci of"+i+"is:"+a);
		c=a+b;
		a=b;
		b=c;	
		
	}
	
	}

}
