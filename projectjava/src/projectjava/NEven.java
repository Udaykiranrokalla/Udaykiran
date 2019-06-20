package projectjava;

import java.util.Scanner;

public class NEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=s.nextInt();
         int res=(n*(n+1))/2;
         System.out.println(res);
	        }
}
