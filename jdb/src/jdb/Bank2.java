package jdb;
import java.util.*;
import java.sql.*;
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
public class Bank2 {

	public static void main(String[] args)throws ClassNotFoundException,SQLException,Isb,Bal,Deposit{
		// TODO Auto-generated method stub
		int a;
		 Class.forName("com.ibm.db2.jcc.DB2Driver");
	     Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	     System.out.println("Connect successfully");	    
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter account number and password :");
	     Scanner s=new Scanner(System.in);
			int acc=s.nextInt();
			String pwd=s.next();
			PreparedStatement ps=con.prepareStatement("select * from bank2 where password=?");
			ps.setString(1, pwd);
			ResultSet r=ps.executeQuery();
			if(r.next()) 
			{
			while(true)
			{
	    	System.out.println("Bank process");
	        System.out.println("1.Withdraw\t2.Balance\n3.Deposit\t4.Exit");
	 	    System.out.println("Enter choice :");
	 	     a=sc.nextInt();
	 	     switch(a)
	 	     {
	 	     case 1:
             System.out.println("Enter amount :");
             int b=sc.nextInt();
            PreparedStatement p=con.prepareStatement("select * from bank2 where password=?");
 			p.setString(1, pwd);
 			ResultSet rs=p.executeQuery();
 			if(rs.next()) 
 			{
             int bal=rs.getInt("AMOUNT");
             System.out.println(bal);
 		    if(bal>b)
 		   	{
 		    	PreparedStatement ps2=con.prepareStatement("update bank2 set AMOUNT=? where password=?");
 				ps2.setString(2, pwd);
 				ps2.setInt(1,bal-b);
 	    		int i=ps2.executeUpdate();
 	    		if(i>0)
 	    		{
 	    			System.out.println("Withdraw successfully");
 	    			PreparedStatement ps3=con.prepareStatement("Select amount from bank2 WHERE password=?");
 	    			ps3.setString(1,pwd);
 	    			ResultSet r1=ps3.executeQuery();
 	    			while(r1.next())
 	    			{
 	    				int avail=r1.getInt("AMOUNT");
 	    				System.out.println("Available balance is:"+avail);
 	    			}
 	    			
 	    		}
 		   	}
 		   	else
 		   	{   
 		   		
 	    	 	throw new Isb("Insufficient balance");
 		   	}
 			}
 		    break;
 		    case 2:
 		    	PreparedStatement ps1=con.prepareStatement("Select * from bank2 where password=?");
 		    	ps1.setString(1,pwd);
 		    	ResultSet rs1=ps1.executeQuery();
 		    	if(rs1.next())
 		    	{
 		    		int balance=rs1.getInt("AMOUNT");
 		    		System.out.println("Balance is :"+balance);
 		    	}
 		    	break;
 		    case 3:
 		    	PreparedStatement ps2=con.prepareStatement("Select * from bank2 where password=?");
 		    	ps2.setString(1,pwd);
 		    	ResultSet rs2=ps2.executeQuery();
 		    	if(rs2.next())
 		    	{
 		    		int abal=rs2.getInt("AMOUNT");
 		    		System.out.println("Enter amount for deposit");
 		    		int a1=sc.nextInt();
 		    		if(a1<500)
 		    		{
 		    			throw new Deposit("Minimum balance is five hundred");
 		    		}
 		    		else
 		    		{
 		    			int amount=abal+a1;
 		    			PreparedStatement ps4=con.prepareStatement("update bank2 set AMOUNT=? where password=?");
 		    			ps4.setString(2,pwd);
 		    			ps4.setInt(1,a1);
 		    		    int c=ps4.executeUpdate();
 		    		    if(c>0)
 		    		    {
 		    		    	System.out.println("Deposited succesffully");
 		    		    	System.out.println("Available balance is :"+amount);
 		    		    }
 		    			
 		    		}
 		    	}
	         break;
 		    case 4:
 		    	System.out.println("process completed");
 		    	
 		   default:
 			   System.out.println("Invalid choice");
	     }
	  }
	}
	con.close();		
	}
}

	
	