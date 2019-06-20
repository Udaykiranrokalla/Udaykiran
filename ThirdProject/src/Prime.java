import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
Scanner scan =new Scanner(System.in);
System.out.println("enter a number");
int n=scan.nextInt();
int i=1,c=0;
for(i=1;i<=n;i++)
{
	if(n%i==0)
	{
		c++;
	}
}
if(c==2)
{
	System.out.println(n+" is a prime number");
}
else
{
	System.out.println(n+" is not a prime number");
}
	
}
}
