package javaproject;

import java.util.Scanner;

public class biggestnumber {
	public static void main(String args[]) {
		System.out.println("enter 3 numbers to find biggest number");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b= obj.nextInt();
		int c= obj.nextInt();
		if(a>b && a>c) {
			System.out.println(" a is biggest number");
		}
			elseif(b>a && b>c) {
				System.out.println(" b is biggest number");
			}
				else{
					System.out.println(" c is biggest number");
					
				}
			
		
		
	}
	

}
