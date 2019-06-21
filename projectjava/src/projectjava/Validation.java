package projectjava;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=s.nextInt();
		if(n<0 || n>9)
		{
			System.out.println("enter between 0 to 9 only");
		}
		else
		{
			System.out.println("entered correct value ");

		}

	}

}
