package ramesh;
import java.util.*;
public class Perfect {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int n,sum=0,i=1;
	System.out.println("enter the number");
	n=sc.nextInt();
	while(i<=n)
	{
		if(n%i==2)
		{
			sum=sum+i;
		}
		i++;
	}
	if(n==sum)
	{
		System.out.println("the perfect number");
	}
	else
	{
		System.out.println("not aperfect number");
	}
			
}
}
