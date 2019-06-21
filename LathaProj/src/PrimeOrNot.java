import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("enter number");
	     int n=sc.nextInt();
	     int flag=1;
	     for(int i=2;i<=n/2;i++) {
	         		 if(n%i==0)
	    		 {
	    			flag=0;
	    			break;
	    		 }
	    	 }
	    	 if(flag==1) {
	    		 System.out.println("prime");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("not a prime");
	    	 }
	}

}
