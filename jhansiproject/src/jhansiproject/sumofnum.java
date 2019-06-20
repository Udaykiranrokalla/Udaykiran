package jhansiproject;
import java.util.*;
public class sumofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
		Scanner sc=new Scanner(System.in);
  System.out.println("enter a number to find even numbers");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++)
  {
	  if(i%2==0)
	  {
	  sum=sum+i;
     }
  }
	  System.out.println ("sum of all even numbers ="+sum);
	}
}
	
	


