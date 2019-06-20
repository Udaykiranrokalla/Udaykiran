package exercises;
import java.util.Scanner;
public class Coorinates 
{
	Scanner scan = new Scanner(System.in);
	int x;
	int y;
	System.out.println("enter x value");
	x=scan.nextInt();
	System.out.printf("enter y value");
	y=scan.nextInt();
	if(x==0 && y==0)
      System.out.println("the given coordinate is origin");
	else if (x==0 && y!=0)
		System.out.println("the given coordinate lies on y-axis");
	else if (x1=0 && y==0)
		System.out.println("the given coordinate lies on x-axis");
	else
		System.out.println("the given coordinate lies between the qudrants");
}
}