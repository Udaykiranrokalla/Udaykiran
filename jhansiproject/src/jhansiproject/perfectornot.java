package jhansiproject;
import java.util.*;
public class perfectornot {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int add=0;
for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		add=add+i;
	}
 }
	 if(add==n)
	 {
		 System.out.println(n+ " is a petfect number");
	 }
	 else
	 {
		 System.out.println(n+ "is not a perfect number");
	 }
	 
		
}
	
}


