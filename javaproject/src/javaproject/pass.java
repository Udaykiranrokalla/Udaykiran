package javaproject;

import java.util.Scanner;

public class pass {
	public static void main(String args[]) {
		System.out.println("enter  student marks");
		Scanner obj=new Scanner(System.in);
		System.out.println("enter  student m1 marks:");
		int a=obj.nextInt();
		System.out.println("enter  student m2 marks:");
		int b=obj.nextInt();
		System.out.println("enter  student m3 marks:");
		int c=obj.nextInt();
		if(a>35 && b>35 && c>35)
			System.out.println("student successfully passed all subjects:");
		else
			System.out.println(" sorry student failed:");
				double d=0.0;
				d= (a+b+c)/3.00;
				System.out.println(" avarage of student is :"+d);
 }
	}
