package ramesh;
import java.util.*;
public class Armstrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=num;
		int rem,sum=0;
		while(num>0)
		{
			rem=num*10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+"is armstrong number");
		}
		else
		{
			System.out.println(temp+"is not a armstrong number");
		}
	}

}
