package ramesh;

public class secondlarg
{
	public static void main(String[]args)
	{
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int largest=a[0];
		int secondlargest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest) {
				secondlargest=largest;
				largest=a[i];
			}
			else if(a[i]>secondlargest)
				secondlargest = a[i];
			}
		
	System.out.println("second largest number is:"+secondlargest);
	}
}