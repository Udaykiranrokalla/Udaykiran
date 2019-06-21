import java.util.*;
public class Primenumber {
public static void main(String[] args) {
	int n,i,count=0;
	Scanner scan=new Scanner(System.in);
			System.out.println("enter a number range ");
	n=scan.nextInt();
	for(n=1;n>100;n++)
	{
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
			count++;
			break;
			}
				
        if(count==2)
        {
        	System.out.println("priome number" +n);
        }
				
			}
	}
}
}
