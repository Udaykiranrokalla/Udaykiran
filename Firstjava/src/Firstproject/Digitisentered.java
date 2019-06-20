package Firstproject;

import java.util.Scanner;

public class Digitisentered 
	 {
	 public static void main(String arg[])
	 {
	 Scanner scan = new Scanner(System.in);
	 int dig;
	 System.out.println("enter the digit");
	 dig = scan.nextInt();
	switch(dig)
	 {
	 case 0:System.out.printf("zero");break;
	 case 1:System.out.printf("one");break;
	 case 2:System.out.printf("two"); break;
	case 3: System.out.printf("three");break;
	case 4: System.out.printf("four");break;
	 case 5: System.out.printf("five");break;
	 default: System.out.printf("not a digit");break;
	}
	}

}
