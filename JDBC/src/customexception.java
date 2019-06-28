import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
class Balance extends Exception
{
Balance(String s2)
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
public class customexception 
{
public static void main(String args[]) throws Login,Isb,Balance,Deposit, ClassNotFoundException, SQLException
{
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con = DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr7","miracle7");
	System.out.println("get connection");
	System.out.println("pls enter the accnumbr:\npassword:");
	Scanner obj=new Scanner(System.in);
	int id=obj.nextInt();
	String s=obj.next();
	int s2=obj.nextInt();
	PreparedStatement pst = con.prepareStatement("select * from bank where password=?");
	pst.setInt(1,s2);
	ResultSet r=pst.executeQuery();
	if(r.next())
	{  
		while(true) {
	   System.out.println("1.Withdraw\n.Balance\n3.Deposit\n.Exit");
	   System.out.println("Enter choice :");
	  int a=obj.nextInt();
	   	switch(a)
	   	{
	   	case 1: System.out.println("please Enter amount");
		   	int amount=obj.nextInt();
			PreparedStatement p=con.prepareStatement("select * from bank where password=?");
			p.setInt(1,s2);
			ResultSet rs=p.executeQuery();
			if(rs.next()) {
            int balance=rs.getInt("BALANCE");
            if(balance<amount)
		   	{
		   	throw new Isb("low balance");
		   	}
            else {
            	PreparedStatement pp=con.prepareStatement("update bank set balance=? where password=?");
				pp.setString(2, s);
				pp.setInt(1, balance-amount);
	    		int i=pp.executeUpdate();
				if(i>0)
	    		{   
					
	    			System.out.println("balance:");
	    			PreparedStatement rb=con.prepareStatement("select balance from bank where password=?");
                    rb.setString(1, s);
        			ResultSet total=rb.executeQuery();
        			while(total.next()) {
        	            int b=total.getInt("BALANCE");
                        System.out.println(b);
        			}
	    		}
	    		
		   	}

		   	break;
		   	
		   	case 2 :
		     	{
	    			PreparedStatement rb=con.prepareStatement("select balance from bank where password=?");
                    rb.setString(1, s);
                    ResultSet rss=rb.executeQuery();
        			if(rss.next()) {
        	            int rbal=rss.getInt("BALANCE");
                        System.out.println(rbal);
        			}


		     	}
		   	    break;
		   	    
		   	case 3 :
		   	{   
		   		PreparedStatement gg=con.prepareStatement("select * from bank where password=?");
                gg.setString(1, s);
                ResultSet rss=gg.executeQuery();
                if(rss.next()) {
	            int rbal=rss.getInt("balance");
	            System.out.println("enter amount deposit");
		   	    int depobal=s.nextInt();
		   		PreparedStatement pp=con.prepareStatement("update bank set balance=? where password=?");
		   		int ubal= rbal+depobal;
		   		pp.setString(2, s);
		   	    pp.setInt(1, ubal);
	    		int i=pp.executeUpdate();
	    		if(i>0)
	    		{
	    			System.out.println("balance deposited successfully.Available balance is "+ubal);
	    		}
                }
   			   
		   	}
		   	break;
		   	
		   	case 4 :
		   	{
    			System.out.println("Thank you");
    			

		   	}break;
		   	
		        default :
		   	System.out.println("Invalid option");
		   	
		   	
			}
		   	
		   	            }
		}
}
}
}
