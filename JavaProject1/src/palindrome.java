
public class palindrome {
	public static void main(String[]args)
	{
		int x =232;
		int y=0;
		int z=0;
		int a=x;
		while(x>0)
		{
			y=x % 10;
			z =y * 10 + y;
			x = x/10;
		}
		if (z == a)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
