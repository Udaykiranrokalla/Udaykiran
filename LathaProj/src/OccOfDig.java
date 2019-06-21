import java.util.*;
public class OccOfDig {
public static void main(String args[]) {
	System.out.println("enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rem=0;
	int a[]=new int[10];
	while(n>0)
	{
		rem=n%10;
		if(a[rem]>=0) {
			a[rem]++;
		}
		n=n/10;
	}
	for(int i=0;i<10;i++) {
		if(a[i]>0) {
			System.out.println(i+"is occurred"+a[i]+"times");
		}
	}
}
}
