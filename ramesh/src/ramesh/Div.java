package ramesh;
import java.util.*;
public class Div {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	if(n%3==0&&n%5==0)
	{
		System.out.println("the number is divisible by 3 and 5");
	}
	else
	{
		System.out.println("the number is not divisible by 3 and 5");
	}
	}

}
