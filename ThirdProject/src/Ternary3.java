import java.util.Scanner;

public class Ternary3 {
	public static void main(String[] args) {
		int a,b,c,max;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter three numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		max=a>(b>c?b:c)?a:(b>c?b:c);
		System.out.println("biggest of three numbers is " +max);	
	}

}
