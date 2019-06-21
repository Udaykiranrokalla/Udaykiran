package jhansiproject;
import java.util.*;
public class Menucalculator {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a and b values");
int a=sc.nextInt();
int b=sc.nextInt();
int c;
System.out.println("enter operator");
char op=sc.next().charAt(0); 
switch (op)
{
case '+': c=a+b;
         System.out.println("addition="+c);
         break;
case '-': c=a-b;
         System.out.println("substraction="+c);
          break;
case '*': c=a*b;
          System.out.println("multiplication="+c);
          break;
case '/': c=a/b;
         System.out.println("division"+c);
         break;
case '%': c=a%b;
          System.out.println("percentge"+c);
          break;
          default:System.out.println("invalid operator");
}

}
}
