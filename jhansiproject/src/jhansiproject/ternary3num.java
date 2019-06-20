package jhansiproject;
import java.util.*;
public class ternary3num {
public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter 3 numbers");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();
    int res=a+b+c;
     res=(a>b && a>c)?a:(b>c)?b:c;
    System.out.println(res+ "biggest");
   
	}

}
