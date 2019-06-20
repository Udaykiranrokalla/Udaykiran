import java.util.*;
public class BigNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
	     System.out.println("enter 2 numbers");
	     int n=sc.nextInt();
	     int m=sc.nextInt();
	     if(n>m) {
	    	 System.out.println(n+"is big");
	     }
	     else {
	    	 System.out.println(m+"is big");
	     }
	}

}
