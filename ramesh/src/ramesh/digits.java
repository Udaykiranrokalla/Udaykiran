package ramesh;
import java.util.*;
public class digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,count=0;
		int i=1;
		System.out.println("enter a number");
		n=sc.nextInt();
		while(i<=n)
		{
			n=n/10;
			count=count +1;
		}
	System.out.println("number of digits="+count);
	}
}
