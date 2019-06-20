package ramesh;
import java.util.*;
public class evennumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;int sum=0;int i;
		System.out.println("enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
			if(i%2==0)
				sum=sum+i;
		System.out.println("sum="+sum);
	}

}
