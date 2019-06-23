package exception;
import java.util.Scanner;
 class login extends Exception {
  login(String s)
  {
	  super(s);
  }
	class isb extends Exception
	{
		isb(String s1)
		{
			super(s1);
		}
	}
	class bal extends Exception
	{
	 bal(String s2)
	 {
		 super(s2);
	 }
	}
	 class deposit extends Exception
	{
		deposit(String s3)
		{
			super(s3);
		}
	}
		class Exit extends Exception
		{
		  Exit(String s4)
		  {
			  super(s4);
		  }
		}
		
public class A{
		public static void main(String[]args) throws login,deposit,isb;
		{
		 int ano=13256,amount=50000,a=0,withdraw=0;
		 String pwd="jhanu";
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter your choice");
		 a=sc.nextInt();
		 switch(a)
		 {
		 case 1: System.out.println("enter account number");
		        int ac=sc.nextInt();
		        System.out.println("enter password");
		         int p=sc.nextInt();
		         string password
		 }
		
		}
		// TODO Auto-generated method stub

	}

}
