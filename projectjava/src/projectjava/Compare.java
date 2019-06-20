package projectjava;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
        System.out.println("enter 2 integer values");
         a=s.nextInt();
         b=s.nextInt(); 
         int big= (a > b)? a : b ;
         System.out.println(big);
	}

}
