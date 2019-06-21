package ramesh;
import java.util.*;
public class Spellthenumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rem,rev=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		while(rev>0)
		{
			rem=rev%10;
			switch(rem)
			{
			case 0:System.out.println("Zero");break;
			case 1:System.out.println("First");break;
			case 2:System.out.println("Second");break;
			case 3:System.out.println("Three");break;
			case 4:System.out.println("Four");break;
			case 5:System.out.println("Five");break;
			case 6:System.out.println("Six");break;
			case 7:System.out.println("Seven");break;
			case 8:System.out.println("Eight");break;
			}
			rev=rev/10;
			}
		}

	}


