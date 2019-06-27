package String;
import java.util.*;
public class secbig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
	System.out.println("enter size of an array");
	int n=sc.nextInt();
	int temp=0,i,j;
	System.out.println("enter each element");
	int a[]=new int[n];
	for( i=0;i<n;i++)
	{
		a[i]= sc.nextInt();
	}
	
	for( i=0;i<n;i++)
	{
		for( j=i+1;j<n;j++)
		{
			 if(a[i]<a[j])
			 {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
	    }
	}
	System.out.println("second largest number="+a[1]);
	System.out.println("second smallest number=" +a[n-2]);
	}
}


