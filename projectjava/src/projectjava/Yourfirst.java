package projectjava;

import java.util.Scanner;

public class Yourfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char YourFirstInitial;
	       System.out.println("enter your character");
	       Scanner s=new Scanner(System.in);
	       YourFirstInitial=s.next().charAt(0);
	       System.out.println(YourFirstInitial);
	}

}
