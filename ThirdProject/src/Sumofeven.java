import java.util.Scanner;

public class Sumofeven {
	public static void main(String[] args) {
		int n,i,evensum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number:");
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
			}
		}
		System.out.println("sum of even numbers are " +evensum);
			}
}
