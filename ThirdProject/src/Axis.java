import java.util.*;
public class Axis {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter x and y axis");
		int x=scan.nextInt();
		int y=scan.nextInt();
		if(x==0&&y==0)
		{
			System.out.println("origin");
		}
		else if(x==0&&y!=0)
		{
			System.out.println("y-axis");
		}
		else if(x!=0&&y== 0)
		{
			System.out.println("x-axis");

		}
		else
			System.out.println("doesn't lie on any axis");

	    	

	}

}
