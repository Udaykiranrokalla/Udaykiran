import java.util.*;
public class Fibnoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
	int n=sc.nextInt();
	int a=0,b=1;
	System.out.println(a);
	System.out.println(b);
	int c;
	for(int i=2;i<n;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
	}
	}

}
