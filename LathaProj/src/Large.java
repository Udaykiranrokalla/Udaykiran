import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int rem=0,big=0;
		while(n>0) {
			rem=n%10;
			if(rem>big) {
				big=rem;
			}
			
			n=n/10;
		}
		System.out.println("the large digit="+big);
	}

}
