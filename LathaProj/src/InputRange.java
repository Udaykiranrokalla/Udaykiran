import java.util.*;
public class InputRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     if(n>=1 && n<=10) {
    	 System.out.println(n+"is between 1 to 10 range ");
     }
     else
     {
    	 System.out.println(n+"is not in range between 1 to 10");
     }
	}

}
