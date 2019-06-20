package projectjava;
import java.util.*;
public class Odd_Even {
 public static void main(String args[])
 {
	 System.out.println("enter a number to check weather odd or even:");
     Scanner hari=new Scanner(System.in);
     int n=hari.nextInt();
     sum(n);
 }
  static void sum(int s)
 {
	 if(s%2==0)
	 {
		 System.out.println("even");
	 }
	 else
		 System.out.println("odd");
 }

}
