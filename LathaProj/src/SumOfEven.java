import java.util.*;
public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int sum=0;
      System.out.println("enter number");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++) {
    	 if(i%2==0) {
    		 sum=sum+i;
    	 }
     }
     System.out.println("the sum of even numbers="+sum);
	}

}
