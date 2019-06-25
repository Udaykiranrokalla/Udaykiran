import java.util.*;
public class Primenumber {
public static void main(String[] args) {
	int n,i,flag=0;
	Scanner scan=new Scanner(System.in);
			System.out.println("enter a number range ");
	n=scan.nextInt();
	for(int j=2;j<=n;j++)
	{ 
		flag=0;
		for(i=2;i<=j/2;i ++)
		{
			if(j%i==0)
			{
			flag=1;
			break;
			}
		}
        if(flag==0)
        {
        	System.out.println(j);
      }
        	
			}
	}
}
