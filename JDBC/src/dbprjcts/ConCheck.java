package dbprjcts;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConCheck {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int id,ph;
		String name,branch;
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr9","miracle9");
		System.out.println("coneected successfully");
		System.out.println("enter student data i.e.. id,name,branch,ph");
		id=s.nextInt();
        name=s.next();
        branch=s.next();
        ph=s.nextInt();
		PreparedStatement ps=c.prepareStatement("insert into studentz values (?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3,branch);
		ps.setInt(4, ph);
        int i=ps.executeUpdate();
        if(i>0)
        { 
        	System.out.println("successfully data entered");
        }
        else
        {
        	System.out.println("failed");

        }c.close();
	}

}
