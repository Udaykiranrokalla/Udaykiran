import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
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
public class A {
	public static void main(String[] args)throws Login,Isb,Deposit,Bal, ClassNotFoundException, SQLException
	{
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	 Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle3");
	System.out.println("connected");
    System.out.println("enter your account number and password");
    	Scanner s=new Scanner(System.in);
	int accno=s.nextInt();
	String pwd=s.next();
	PreparedStatement ps=c.prepareStatement("select * from A where password=?");
	  ps.setString(1, pwd);
	ResultSet r=ps.executeQuery();
	
	     while(true)
	     {
	   	System.out.println("Bank process");
	    System.out.println("1.Withdraw\t2.Balance\n3.Deposit\t4.Exit");
	    System.out.println("Enter choice :");
	    int a=s.nextInt();
    	switch(a)
	    	{
	    			
	    	case 1:
	    	{
	    		System.out.println("Enter amount");
	    		int amount=s.nextInt();
	    		PreparedStatement p=c.prepareStatement("select * from A where password=?");
	    		p.setString(1, pwd);
				ResultSet rs=p.executeQuery();
				if(rs.next()) {
	            int bal=rs.getInt("BALANCE");
				    if(bal<amount)
				   	{
				   	throw new Isb("Insufficient balance");
				   	}
				   	else
				   	{   
				   		PreparedStatement uk=c.prepareStatement("update A set balance=? where password=?");
						uk.setString(2, pwd);
						uk.setInt(1, bal-amount);
			    		int i=uk.executeUpdate();
						if(i>0)
			    		{   
							
			    			System.out.println("availabale balance after withdrawn is:");
			    			PreparedStatement rb=c.prepareStatement("select balance from A where password=?");
		                    rb.setString(1, pwd);
		        			ResultSet rss=rb.executeQuery();
		        			while(rss.next()) {
		        	            int rbal=rss.getInt("BALANCE");
		                        System.out.println(rbal);
		        			}
			    		}
			    		
				   	}
				   	
					}
	    	}
	    	case 2:
	    	{
	    		PreparedStatement v=c.prepareStatement("select balance from A where password=?");
                v.setString(1, pwd);
                ResultSet rss=v.executeQuery();
    			if(rss.next()) {
    	            int rbal=rss.getInt("BALANCE");
                    System.out.println(rbal);
    			}
    			}
	    	case 3:
	    	
	    		PreparedStatement k=c.prepareStatement("select * from A where password=?");
                   k.setString(1, pwd);
	    		ResultSet rv=k.executeQuery();
	    		if(rv.next()) {
	    	
	    			int rbal=rv.getInt("BALANCE");
	    				System.out.println("Enter amount you want to deposit :");
	    					int depobal=s.nextInt();
	    		   		PreparedStatement uv=c.prepareStatement("update A set balance=? where password=?");
	    		   		int ubal= rbal+depobal;
	    		   		uv.setString(2, pwd);
	    		   	    uv.setInt(1, ubal);
	    	    		int i=uv.executeUpdate();
	    	    		if(i>0)
	    	    		{
	    	    			System.out.println("balance deposited successfully.Available balance is "+ubal);
	    	    		}
	    		           }
	    		 break;
	       	
	    		 case 4:
	    		 {
	    			 System.out.println("terminated");
	    			 break;
	    		 }
	    		// Default:
	    		 //{
	    			// System.out.println("invalid option");
	    		 //}
	    	}
	     }
	}}
	    		 
	     