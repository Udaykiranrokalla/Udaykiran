package projectjava;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number:");        
		int n=s.nextInt();
		while( i <= n)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}

}
