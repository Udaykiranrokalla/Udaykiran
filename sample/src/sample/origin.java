package sample;

import java.util.Scanner;

public class origin {
	public static void main(String args[])
	{
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the co-ordinants x and y");
		x=s.nextInt();
		y=s.nextInt();
		
		if(x==0&&y==0)
		{
			System.out.println("the coordinate lies on the origin");	
		}
		else if(x>0&&y>0)
		{
			System.out.println("the coordinate lies first quadrant");	
		}
		else if(x<0&&y>0) {
			System.out.println("the coordinate lies second quadrant");	
		}
		else if(x<0&&y<0)
		{
			System.out.println("the coordinate lies third quadrant");	
		}
		else if(x>0&&y<0) {
			System.out.println("the coordinate lies fourth quadrant");	
		}
		
	}
}


