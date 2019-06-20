package jhansiproject;
import java.util.*;
public class primenum {
public static void main(String[] args) {
		// TODO Auto-generated method stub
  int flag=0;
	Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
for(int i=2;i<=n/2;i++)
{
	if(n%i==0)
	{
		flag=1;
		break;
	}
}
  if(flag==0)
 {
	System.out.println(n+ "is a prime number");
 }
	else 
	{
	System.out.println(n+ "is not a prime number");
	   }
 }
  
 }
	


