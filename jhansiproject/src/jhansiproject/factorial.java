package jhansiproject;
import java.util.*;
public class factorial {
public static void main(String[] args) {
		// TODO Auto-generated method stub
      int fact=1;
      Scanner Sc=new Scanner(System.in);
      System.out.println("enter a number");
      int n=Sc.nextInt();
      for(int i=1;i<=n;i++)
      {
	    fact=fact*i;
      }
      System.out.println(fact);
	}


}
