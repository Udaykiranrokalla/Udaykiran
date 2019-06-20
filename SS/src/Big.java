import java.util.Scanner;
public class Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+"is big");
		}
		else
		{
			System.out.println(b+"is big");
		}
		

	}

}
