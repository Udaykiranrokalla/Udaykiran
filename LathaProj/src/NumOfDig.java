import java.util.*;
public class NumOfDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter number");
  int n=sc.nextInt();
  int count=0,rem=0;
  while(n>0) {
	  rem=n%10;
      count++;
      n=n/10;
  }
  System.out.println("number of digits="+count);
	}

}
