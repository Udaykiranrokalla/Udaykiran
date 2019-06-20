import java.util.Scanner;
public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter a number:");
         n=s.nextInt();
         if(n%2==0)
         {
        	 System.out.println(n+"is even number");
         }
         else
         {
        	 System.out.println(n+"is odd number");
         }
	}

}
