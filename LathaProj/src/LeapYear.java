import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     if(n%4==0)
     {
    	 System.out.println(n+"is leap year");
    	     }
     else {
    	 System.out.println(n+"is not leap year");
     }
	}

}
