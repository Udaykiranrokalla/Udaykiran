package exercises;

import java.util.Scanner;

public class PositiveNegative {
		    public static void main(String[] args) 
	    {
	        System.out.println("enter a number");
	        Scanner scan = new Scanner(System.in);
	        int n=scan.nextInt();
	        if(n > 0)
	        {
	            System.out.println("positive number");
	        }
	        else 
	        {
	            System.out.println("negative number");
	        }
	        
	    }
}