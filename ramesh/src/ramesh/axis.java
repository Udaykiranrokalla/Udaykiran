package ramesh;
import java.util.*;
public class axis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two coordinates");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x==0 && y==0)
		{
			System.out.println("the coordinates of axis");
		}
		else if(x==0 && y!=0)
		{
			System.out.println("the coordinate of y axis");
		}
		else if(x!=0 && y==0)
		{
			System.out.println("the coordinate of x axis");
		}
		else
		{
			System.out.println(" thecoordinate lies between the quadrants");
		}

	}

}
