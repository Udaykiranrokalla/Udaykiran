package projectjava;
import java.util.Scanner;

class Login extends Exception
{
Login(String s)
{
super(s);
}
}
class Isb extends Exception
{
  Isb(String s1)
  {
 super(s1);
  }
}
class Bal extends Exception
{
Bal(String s2)
{
super(s2);
}
}
class Deposit extends Exception
{
Deposit(String s3)
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

public class CustBank {
	public static void main(String[] args)throws Login,Isb,Deposit,Bal
	{
		// TODO Auto-generated method stub
		int acc=132442,a=0,b,amount=6000,w,total=0,d;
		String pwd="hello";
		Scanner c=new Scanner(System.in);
		System.out.println("Enter account no :");
		b=c.nextInt();
		System.out.println("Enter password :");
		Scanner sc=new Scanner(System.in);
		String pwd1=sc.nextLine();
		if(b!=acc && pwd1.equals(pwd)==false)
		{
		throw new Login("Invalid account number and password");
		}
		else if(b==acc && pwd1.equals(pwd)==false)
		{
		throw new Login("Invalid password");
		}
		else if(b!=acc && pwd1.equals(pwd)==true)
		{
		throw new Login("Invalid account name");
		}
		else
		{
		System.out.println("Login successfull");
		}
		    while(true)
		    {
		   	System.out.println("Bank process");
		       System.out.println("1.Withdraw\t2.Balance\n3.Deposit\t4.Exit");
		   System.out.println("Enter choice :");
		    a=c.nextInt();
		   	switch(a)
		   	{
		   	
		   	case 1:
		   	System.out.println("Enter amount");
		   	w=c.nextInt();
		   	if(amount<w)
		   	{
		   	throw new Isb("Insufficient balance");
		   	
		   	}
		   	else
		   	{
		   	total=amount-w;
		   	System.out.println("Amount After withdrawal is "+total);
		   	}
		   	
		   	
		   	System.out.println("hello");
		   	
		   	break;
		   	case 2:
		   	if(amount==0)
		   	{
		   	throw new Bal("Zero balance");
		   	}
		   	else
		   	{
		   	System.out.println("Total amount is "+amount);
		   	}
		   	break;
		   	case 3:
		   	System.out.println("Enter amount for deposit :");
		   	d=c.nextInt();
		   	if(d<500)
		   	{
		   	throw new Deposit("minimum deposit amount is Five hundred repees");
		   	}
		   	else
		   	{
		   	amount=amount+d;
		   	System.out.println("Amount after deposit :"+amount);
		   	System.out.println("Deposited successfully");
		   	}
		   	break;
		   	case 4:
		   	System.out.println("terminated");
		   	break;
		   	
		        default :
		   	System.out.println("Invalid option");
		   	}
		   	

		   	}

		

	}

}



