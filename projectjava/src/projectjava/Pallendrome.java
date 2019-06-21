package projectjava;

import java.util.Scanner;

public class Pallendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,r;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=s.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("pallendrome");
		}
		else
			System.out.println(" not a pallendrome");

	}

}
