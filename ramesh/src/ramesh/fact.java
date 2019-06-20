package ramesh;
import java.util.*;
public class fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=1;int fact=1;
		int n;
		System.out.println("enter the number");
		n=sc.nextInt();
		while(i<=n)
		{
		fact=fact*i;
		i++;
		}
		System.out.println("factorial="+fact);
	}

}
