import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Check {
public static void main(String args[])throws ClassNotFoundException, SQLException
 {
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr5", "miracle5");
	System.out.println("Connection succesfully");
	//System.out.println("enter employee details");
	PreparedStatement ps=con.prepareStatement("Insert into emp347 values(?,?,?)");
	ps.setInt(1, 511);
	ps.setString(2, "Alekhya");
	ps.setString(3, "developer");
	int z=ps.executeUpdate();
	if(z>0)
	{
		
		System.out.println("successfully");
	}
	else
		System.out.println("not successfully");
	con.close();
	
	}
	

}

