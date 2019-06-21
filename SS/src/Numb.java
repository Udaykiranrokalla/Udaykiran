import java.util.Scanner;
import java.lang.Math;
public class Numb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		double t=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			t=1+1/Math.pow(2,i);
			
		}
		System.out.println("Series is:"+t);

	}

}
