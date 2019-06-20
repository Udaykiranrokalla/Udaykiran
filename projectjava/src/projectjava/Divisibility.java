package projectjava;
import java.util.*;

public class Divisibility {

	public static void main(String[] args) {
		int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number ");
        n=s.nextInt();
        if(((n % 3) == 0) && ((n % 5) == 0))
        {
        	System.out.println("given number can divisible  by 3 and 5");
	    }
        else
        	System.out.println("given number not divisible  by 3 and 5");

}
}

