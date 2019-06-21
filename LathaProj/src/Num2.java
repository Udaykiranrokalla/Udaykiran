import java.util.*;
public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number");
	int n=sc.nextInt();
 double sum=1.0;
	for(int i=1;i<=n;i++) {
		sum=sum+1/Math.pow(2,i);
	}
	System.out.println(sum);
	}

}
