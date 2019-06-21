package exercises;

public class SumFactorial {
	public static void main(String args[])
	{
		int fact =1;
		int x=5;
		int n=4;
		double sum =1;
		for (int i=1;i<=n;i++)
		{
			fact=fact *i;
			sum = sum+Math.pow(x,i)/fact;
		}
	}

}
