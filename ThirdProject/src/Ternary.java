import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		int n1,n2,max;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		n1=scan.nextInt();
		n2=scan.nextInt();
		max =(n1>n2)? n1 :n2;
		System.out.println("max number is " +max);
	}
	

}
