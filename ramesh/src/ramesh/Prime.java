package ramesh;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,count=0;
		for(i=2;i<=10;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==2)
				System.out.println(i+"is aprime");
			else
				System.out.println(i+"is not prime");
		}
	}

}
