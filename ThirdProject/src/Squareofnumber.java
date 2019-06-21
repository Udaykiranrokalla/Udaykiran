import java.util.Scanner;
public class Squareofnumber {
public static void main(String[] args) {
	int n,square;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number to its square:");
	n=scan.nextInt();
	square=n*n;
	System.out.println("square of number is " +square);
}
}
