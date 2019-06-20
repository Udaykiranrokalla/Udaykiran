package projectjava;
import java.util.*;
public class Odd_Even {
 public static void main(String args[])
 {
	 System.out.println("enter a number to check weather odd or even:");
     Scanner hari=new Scanner(System.in);
     int n=hari.nextInt();
     Odd_Even ob=new Odd_Even();
     ob.sum(5);
 }
   void sum(int s)
 {
	 if(s%2==0)
	 {
		 System.out.println("even");
	 }
	 else
		 System.out.println("odd");
 }

}
