package jhansiproject;
import java.util.*;
public class armstrong {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int temp=n,rem=0;
while(n>0)
{
	rem = n%10;
	n=rem + (rem*rem*rem);
	n=n/10;
	}
System.out.println(n);
if(temp==n)
{
	System.out.println(temp+ " is a armstrong number");
	}
else
{
	System.out.println(temp+ " is not a armstrong number");
	
}
}

}
