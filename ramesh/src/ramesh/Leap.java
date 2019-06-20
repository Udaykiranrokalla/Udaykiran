package ramesh;
import java.util.*;
public class Leap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter anumber");
		int n=sc.nextInt();
		if(n%4==0)
		{	
			System.out.println("this is the leapyear");
		}
		else
		{
			System.out.println("this is not leapyear");
		}
	}

}
