import java.util.*;
public class AddFirstLastDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    int a=0,rem=n%10;
    while(n>10)
    {
    	a=a%10;
    	n=n/10;
    }
    System.out.println("the first digit="+n);
    System.out.println("the last digit="+rem);
	}

}
