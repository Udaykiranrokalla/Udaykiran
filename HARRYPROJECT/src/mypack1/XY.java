package mypack1;

import java.util.Scanner;

public class XY
{

	public static void main(String[] args)
	{
	   Scanner scan = new Scanner(System.in);
	   System.out.println("please enter x value");
	   int x= scan.nextInt();
	   System.out.println("enter y value");
	   int y=scan.nextInt();
	   if(x==0 && y==0)
	   {
		   System.out.println("the co-ordinates is origin");
	   }
	   else if(x==0 && y!=0)
	   {
		   System.out.println("the given co-ordinate is in y axis");
	   }
	   else if(x!=0 && y==0)
	   {
		   System.out.println("the given co-ordinate is in x axis");
	   }
	   else
		   System.out.println("it lies between the quandrants");

	}

}
