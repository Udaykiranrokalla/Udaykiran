import java.util.Scanner;
public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,biggest,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		temp=(a>b && a>c) ? a : b;
		biggest=(c>temp) ?c : temp;
		System.out.println(biggest+"is big");
	}

}
