import java.util.*;
public class PassFailStud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
         int sum=0;	
 System.out.println("enter 3 subject marks");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
	      sum=(a+b+c)/3;
	if(sum>=65) {
	     System.out.println("student got first rank");	
	}
	else if(sum>45 && sum<65){
		System.out.println("student got 2nd rank");
	}
	else
	{
		System.out.println("student failed");
	}
	}
}
