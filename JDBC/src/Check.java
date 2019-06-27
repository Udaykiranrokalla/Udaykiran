
import java.sql.*;

public class Check {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");
	PreparedStatement ps=con.prepareStatement("insert into student2 values(?,?,?)");
	ps.setInt(1,105);
	ps.setString(2,"rameshsunil");
	ps.setString(3,"MBA");
	int i=ps.executeUpdate();
	if(i>0) 
	{
	System.out.println("insert");
	}
	else 
	{
	System.out.println("failed to insert");
	}
	}
}
