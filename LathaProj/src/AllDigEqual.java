import java.util.Scanner;

public class AllDigEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int rem=0,big=n%10,flag=0;;
		while(n>0) {
			rem=n%10;
			if(rem!=big) {
				flag=1;
				break;
			}
			n=n/10;
		}
		if(flag==1) {
				System.out.println("the all digits are not equal");
		}
			else {
		System.out.println(" digits are digits are equal");
	}
		}
}
