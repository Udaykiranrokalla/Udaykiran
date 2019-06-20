package jhansiproject;
import java.util.*;
public class biggestof3Num {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter three numbers");
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 if(a>b && b>c)
 {
	 System.out.println("biggest number is " +a);
	 }
 else if(b>c)
 {
	 System.out.println("biggest number is " +b);
 }
 else
 {
	 System.out.println("biggest number is " +c);
 }
 
 }
}


