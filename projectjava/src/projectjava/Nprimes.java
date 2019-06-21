package projectjava;

import java.util.Scanner;

public class Nprimes {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=s.nextInt();
		for(int i=1;i <= n;i++)
		{   
			for(int j=1;j <= i;j++)
			{	
			   if((i % j)==0)
			   {
				count++;				  
   			   }
			}
			
		 if(count == 2)
		 {
				System.out.println(i);
	     }
	   }
	}                                 


   }
              
