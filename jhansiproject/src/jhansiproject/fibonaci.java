package jhansiproject;
import java.util.*;
public class fibonaci{
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in); 
System.out.println("enter number to find fibonaci");
int count=sc.nextInt();
int a=0,b=1,i=1,res=0;
System.out.println(a);
System.out.println(b);
while(i<count)
 {
	res=a+b;
	a=b;	
	b=res;
	System.out.println(res);
    i++;
 }
}
}