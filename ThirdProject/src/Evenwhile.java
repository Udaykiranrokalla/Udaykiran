import java.util.Scanner;

public class Evenwhile {
	public static void main(String[] args) {
		int n=10,i=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number:");
		n=scan.nextInt();
	while(i<=n)
		{
			if(i %2 == 0)
		      System.out.println(i);
		    i++;
		}
}

}

