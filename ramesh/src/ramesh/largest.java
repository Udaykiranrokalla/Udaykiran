package ramesh;
public class largest {
	public static void main(String[] args) {
		int a[]=new int[]{10,20,30,40,50,60,70,80,90};
		int largest=a[0];
		int smallest=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		
		System.out.println("the largest number is:"+largest);
		System.out.println("the smallest number is:"+smallest);
		
	}

}
