package jhansiproject;
import java.util.*;
public class primenum1to10 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");

 int flag=0;
 for(int i=2;i<10;i++)
 {
	 flag=0;
	for(int j=2;j<=i/2;j++)
	{
		if(i%j==0)
		{
		  flag=1;
		  break;
		}
		 
		}
	
	if(flag==0)
		{
		System.out.println(i);
	}
 }
	}

}
