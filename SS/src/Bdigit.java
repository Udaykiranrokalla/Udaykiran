import java.util.Scanner;
public class Bdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=0,n,rem;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n>0)
        {
        	rem=n%10;
        	if(rem>l)
        	{
        		l=rem;
        	}
        	n=n/10;
        }
        System.out.println("biggest digit in given number is "+l);
	}

}
