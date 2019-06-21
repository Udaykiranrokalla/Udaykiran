import java.util.*;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter number");
   int n=sc.nextInt();
   int fact=1,sum=0;
   for(int i=2;i<=n;i++) {
	   fact=fact*i;
   }
   System.out.println(fact);
	}

}
