import java.sql.*;
import java.util.Scanner;

public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");
	PreparedStatement ps=con.prepareStatement("select * from student2");

	ResultSet i=ps.executeQuery();
	while(i.next())
	{
		System.out.println(i.getInt(1)+" "+i.getString(2)+" "+i.getString(3));
		
	}
	
	}
}
