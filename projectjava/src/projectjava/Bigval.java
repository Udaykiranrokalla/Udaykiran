package projectjava;

public class Bigval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=6,c=7,d=9;
		if(a>b && a>c)
		{
			if(a>d)
			{
				System.out.println(a);
			}
			else if(b>c && b>d)
			{
				System.out.println(b);

			}
			else if(c>d)
			{
				System.out.println(c);

			}
		}
		else
		{
			System.out.println(d);

		}
		

	}

}
