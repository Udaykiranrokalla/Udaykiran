import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Check {

public static void main(String args[]) throws ClassNotFoundException, SQLException {
Class.forName("com.ibm.db2.jcc.DB2Driver");
	
Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle3");
PreparedStatement ps = con.prepareStatement("insert into miracle4 values(?,?,?)");
ps.setInt(1, 2);
ps.setString(2, "kiran");
ps.setString(3, "cse");
int i=ps.executeUpdate();
if(i>0)
{
	System.out.println("inserted values into table");
}
	else
	{
		System.out.println("failed to insert");
	}
}
}