import java.util.*;
public class Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("enter number");
          Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         double sum=0.0;
         for(int i=1;i<=n;i++) {
        	 sum=sum+(1/i);
         }
         System.out.println(sum);
	}

}
