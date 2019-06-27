package ramesh;
public class perfectnum {

	public static void main(String[] args) {
		int count=0;
	
		for(int i=1;i<=100;i++)
		{
			count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+i;
				}
			}
			if(count==i)
			{
				System.out.println(count);
			}
		}
	}

}
