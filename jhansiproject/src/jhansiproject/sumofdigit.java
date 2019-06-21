package jhansiproject;
import java.util.*;
public class sumofdigit {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int rem,sum=0;
while(n>0)
{
	rem=n%10;
	sum=sum+1;
	n=n/10;
}
System.out.println(sum+ " digits present in a given number");	
}
}
