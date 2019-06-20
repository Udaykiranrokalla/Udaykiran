import java.util.Scanner;
public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,big;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		n1=s.nextInt();
		n2=s.nextInt();
		big=(n1>n2) ? n1 : n2 ;
        System.out.println("biggest of two numbers"+n1+"and"+n2+"is"+big);
	}

}
