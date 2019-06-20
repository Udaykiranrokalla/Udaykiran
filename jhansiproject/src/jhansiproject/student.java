5package jhansiproject;
import java.util.*;
public class student {
public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a,b,c,avg=0;
	Scanner sc=new Scanner(System.in);
System.out.println("enter 3 students");
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  avg=(a+b+c)/3;
  if(a>60)
  {
	  System.out.println("first rank");
  }
  else if(avg>=50 && avg<=60)
  {
	  System.out.println("second rank");
  }
  else
  {
	  System.out.println("failed");
  }
}



}
