import java.util.*;
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter number");
   int n=sc.nextInt();
   int sum=0,temp;
   for(int i=1;i<n;i++) {
			if(n%i==0) {
			sum=sum+i;
		}
	}
   
	if(n==sum) {
		System.out.println("perfect number");
		}
	else {
		System.out.println("not perfect number");
	}
   }
	}


