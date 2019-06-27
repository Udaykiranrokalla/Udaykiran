import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr1","miracle1");
		System.out.println("coneected successfully");
		PreparedStatement ps=c.prepareStatement("select * from lathastud");
		ResultSet r=ps.executeQuery();
		while(r.next())
		{
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getString(4));
		}
		


	}

}


