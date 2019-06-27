package exercises;
import java.util.*;
public class perfect {

	public static void main(String[] args) {
		int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	for(int i=1;i<=100;i++)
	{
		count=0;
		for(int j=2;j<=i;j++)
		{
			count=count+i;
			if(i%j==0)
			{
				count=count+j;
				
			}
		if(count==i)
		{
			System.out.println(count);
		}
		}
	}
	}

}
