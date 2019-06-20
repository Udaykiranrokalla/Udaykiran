import java.util.*;
public class PrintNEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number");
       int n=sc.nextInt();
      int count=0;
       for(int i=1;count<n;i++) {
    	   if(i%2==0) {
    		   System.out.println(i);
    		   count++;
    	   }
       }
     	}

}
