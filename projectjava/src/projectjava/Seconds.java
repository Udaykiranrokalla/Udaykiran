package projectjava;

import java.util.Scanner;

public class Seconds {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int seconds;
	       System.out.println("enter hour value");
	       Scanner s=new Scanner(System.in);
	       seconds=s.nextInt();
	       int hours=(seconds/3600);
	       System.out.println(hours);

	}

}
