import java.util.Scanner;
public class pos {
      	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();
        if(n>0)
        {
        	System.out.println(n+"is positive number");
        }
        else if(n<0)
        {
        	System.out.println(n+"is negative number");
        }
        else
        {
        	System.out.println("Zero");
        	
        }
	}

}
