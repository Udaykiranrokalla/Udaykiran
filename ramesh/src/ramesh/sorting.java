package ramesh;
import java.util.*;
public class sorting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[];
		int i,j;
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		a=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.println("enter the 5 elements in an array");
			a[i]=sc.nextInt();
		}
		for(i=0;i<4;i++) {
			for(j=i+1;j<5;j++)
			{
				if(a[i]>a[j])
				{
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
				}
			System.out.println("after sorting the array elements=");
		}
	for(i=0;i<5;i++)
	{
		System.out.println("="+a[i]);
	}
}
}
