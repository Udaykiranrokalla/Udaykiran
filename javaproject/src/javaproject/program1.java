package javaproject;
import java.util.Scanner;
public class program1 {
	public static void main(String args[]) {
		System.out.println("enter two numbers");
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b= obj.nextInt();
		int c= a + b;
		System.out.println("total:"+c);
	}
}
