package projectjava;

import java.util.*;

public class NofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = 0;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter number:");        
			int n=s.nextInt();
			while(n>0)
			{
				n=n/10;
				count++;
			}
			System.out.println(count);

	}

}
