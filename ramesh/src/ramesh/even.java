package ramesh;
import java.util.*;
public class even {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n;
	int i;
	System.out.println("enter a number");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			System.out.println("the even numbers is "+i);
		}
	}
	}

}
