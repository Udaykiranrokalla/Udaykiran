package Firstproject;

import java.util.Scanner;

public class Origin 
	{
	public static void main(String arg[])
	{
	Scanner scan = new Scanner(System.in);
	int x;
	int y;
	System.out.println("enter the two coordinates");

	x = scan.nextInt();
	y = scan.nextInt();
	if(x ==0 && y ==0)
	{
	System.out.println("the coordinates in orgin");
	}
	else if(x == 0 && y != 0)
	{
	System.out.println("the coordinates lies in y axis");
	}
	else if(x != 0 && y == 0 )
	{
	System.out.println("the coordinates lies in x axis");
	}
	
	else
	{
	System.out.println("the coordinates lies between the quadrants");
	}
	}

}
