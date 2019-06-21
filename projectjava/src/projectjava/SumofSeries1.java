package projectjava;

import java.util.Scanner;

public class SumofSeries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float sum = 0;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter number:");        
			int n=s.nextInt();
			int i=1;
			for(int j=1;j <= n;j++)
			{
				sum=sum+(i%j);
			}
			System.out.println(sum);
		

	}

}
