package jhansiproject;
import java.util.*;
public class compare2num {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers");
int a=sc.nextInt();
int b=sc.nextInt();
int res= (a>b ? a:b);
System.out.println(res+ " biggest");
}
}
