package projectjava;

import java.util.*;

import java.lang.Math;

public class SumofSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double sum = 1;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter number:");        
			int n=s.nextInt();
			
			for(int i=1;i<= n;i++)
			{   
				
				sum=sum + (1/(Math.pow(2,i)));
				
			}
			System.out.println(sum);
		
	}

}
