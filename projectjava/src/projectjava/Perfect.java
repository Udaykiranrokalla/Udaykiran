package projectjava;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum = 0;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter number:");        
			int n=s.nextInt();
			
			for(int i=1;i<n;i++)
			{
				if((n%i)==0)
				{
					sum=sum+i;
				}
			}
			
			if(sum==n)
			{
				System.out.println("perfect number"+n);
			}
			else
				System.out.println(" not a perfect number"+n);

	}

}
