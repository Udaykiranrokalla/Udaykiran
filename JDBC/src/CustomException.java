import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
class Login extends Exception
{
	Login(String s)
	{
		super(s);
	}
}
class ISB extends Exception
{
	ISB(String s1)
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
public class CustomException
{
	public static void main(String[]args) throws ClassNotFoundException, SQLException, ISB
	{
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr18","miracle18");
		System.out.println("coneected successfully");
		System.out.println("welcome enter your account number and password");
		Scanner s=new Scanner(System.in);
		int acno=s.nextInt();
		String pwd=s.next();
		PreparedStatement ps=c.prepareStatement("select * from bank1 where password=?");
		ps.setString(1, pwd);
		ResultSet r=ps.executeQuery();
		while(r.next())
		{
		   System.out.println("Bank process");
		   System.out.println("1.Withdraw\t2.Balance\n3.Deposit\t4.Exit");
		   System.out.println("Enter choice :");
		  int a=s.nextInt();
		   	switch(a)
		   	{
		   	
		   	case 1:
		   	System.out.println("Enter amount");
		   	int amt=s.nextInt();
			PreparedStatement p=c.prepareStatement("select * from bank1 where password=?");
			p.setString(1, pwd);
			ResultSet rs=p.executeQuery();
			if(rs.next()) {
            int bal=rs.getInt("BALANCE");
		    if(bal<amt)
		   	{
		   	throw new ISB("Insufficient balance");
		   	}
		   	else
		   	{   
		   		PreparedStatement pp=c.prepareStatement("update bank1 set balance=? where password=?");
				pp.setString(2, pwd);
				pp.setInt(1, bal-amt);
	    		int i=pp.executeUpdate();
				if(i>0)
	    		{   
					
	    			System.out.println("balance withdrawn availabale balance is:");
	    			PreparedStatement rb=c.prepareStatement("select balance from bank1 where password=?");
                    rb.setString(1, pwd);
        			ResultSet rss=rb.executeQuery();
        			while(rss.next()) {
        	            int rbal=rss.getInt("BALANCE");
                        System.out.println(rbal);
        			}
	    		}
	    		
		   	}
		   	
			}
		   	
		   	break;
		   	
		   	case 2 :
		     	{
	    			PreparedStatement rb=c.prepareStatement("select balance from bank1 where password=?");
                    rb.setString(1, pwd);
                    ResultSet rss=rb.executeQuery();
        			if(rss.next()) {
        	            int rbal=rss.getInt("BALANCE");
                        System.out.println(rbal);
        			}
		     	}
		   	    break;
		   	    
		   	case 3 :
		   	{   
		   		PreparedStatement gg=c.prepareStatement("select * from bank1 where password=?");
                gg.setString(1, pwd);
                ResultSet rss=gg.executeQuery();
                if(rss.next()) {
	            int rbal=rss.getInt("balance");
	            System.out.println("enter amount u want 2 deposit");
		   	    int depobal=s.nextInt();
		   		PreparedStatement pp=c.prepareStatement("update bank1 set balance=? where password=?");
		   		int ubal= rbal+depobal;
		   		pp.setString(2, pwd);
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
