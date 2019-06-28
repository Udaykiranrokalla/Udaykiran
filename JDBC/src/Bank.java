
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class Bank 
	{

	public static void main(String[] args)throws ClassNotFoundException,SQLException 
	{
	       	Class.forName("com.ibm.db2.jcc.DB2Driver");
	    Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr5","miracle5");
	    System.out.println("Connect successfully");
	    PreparedStatement p=con.prepareStatement("insert into bank3 values(?,?,?)");
	    p.setInt(1,8459651);
	    p.setString(2,"ale");
	    p.setInt(3,6000);
	    p.setInt(1,4125369);
	    p.setString(2,"sam");
	   p.setInt(3,2000);
	   p.setInt(1,498536);
	    p.setString(2,"sai");
	   p.setInt(3,7000);
	   p.setInt(1,4785963);
	    p.setString(2,"harry");
	  p.setInt(3,4000);
	    int i=p.executeUpdate();
	    if(i>0)
	    {
	     System.out.println("Data Inserted successfully");
	    }
	    else
	    {
	  System.out.println("Data insertion failed");
	    }
	  
	    con.close();	    
	}

	}



