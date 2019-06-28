
import java.sql.*;

public class Searching {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");
	PreparedStatement ps=con.prepareStatement("select * from student2 where id=131");

	ResultSet i=ps.executeQuery();

	System.out.println("searching succesfully");
	}
	}
