package src.Exceptionhandling;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
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
class Withdraw extends Exception
{
Withdraw(String s3)
{
super(s3);
}
}
public class A {
public static void main(String[] args)throws Login,Isb, ClassNotFoundException, SQLException
{
int acc=12345,a=0,b,amount=8000,w,total;
Class.forName("com.ibm.db2.jcc.DB2Driver");

Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle3");
PreparedStatement ps = con.prepareStatement("delete from miracle4 where id=23");
String pwd="uday";
Scanner c=new Scanner(System.in);
System.out.println("Bank process");
System.out.println("1.login\t\t2.Withdraw\n3.Balance\t4.Deposit\n5.Exit");
   System.out.println("Enter choice :");
   a=c.nextInt();
    while(a>0)
    {
   	switch(a)
   	{
   	case 1:
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
   	   break;
   	case 2:
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
