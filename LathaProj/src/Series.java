import java.util.*;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
   System.out.println("enter number");
    int n=sc.nextInt();
    int fact=1,x=5;
     double sum=0.0;
    for(int i=1;i<=n;i++) {
    	fact=fact*i;
    	sum=sum+Math.pow(x,i)/fact;
    }
    System.out.println(sum);
    
	}

}
