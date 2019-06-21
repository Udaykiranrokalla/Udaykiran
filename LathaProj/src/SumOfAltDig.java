import java.util.*;
public class SumOfAltDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int sum=0,rem=0;
while(n>0) {
	rem=n%10;
	sum=sum+rem;
	n=n/100;
}
System.out.println("the sum of alternate digits="+sum);
	}

}
