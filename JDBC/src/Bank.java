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
	     PreparedStatement p=con.prepareStatement("insert into bank1 values(?,?,?)");
	     p.setInt(1,245215);
	     p.setString(2,"harry");
	     p.setInt(3,6000);
	     p.setInt(1,2521213);
	     p.setString(2,"nikki");
	     p.setInt(3,2000);
	     p.setInt(1,86545);
	     p.setString(2,"kusu");
	     p.setInt(3,7000);
	     p.setInt(1,547556);
	     p.setString(2,"geeta");
	     p.setInt(3,4000);
	     p.setInt(1,12345);
	     p.setString(2,"hai");
	     p.setInt(3,10000);
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


