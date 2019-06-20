package jhansiproject;
import java.util.*;
public class leapyear {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
 if(n%4==0)
 { 
	 System.out.println(n+ " is a leap year");
 }
 else
 {
	 System.out.println(n+ "is not a leap year");
 }
}

}
