package projectjava;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
				Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				i++;
			}
		}
	}

}
