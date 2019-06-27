
import java.sql.*;

public class Delete1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");
	PreparedStatement ps=con.prepareStatement("delete from student2 where id=107");

	int i=ps.executeUpdate();
	if(i>0) 
	{
	System.out.println("delete succesfully");
	}
	else 
	{
	System.out.println("not successfully");
	}
	}
}
