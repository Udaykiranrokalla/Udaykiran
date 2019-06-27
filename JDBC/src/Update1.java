import java.sql.*;


public class Update1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");
	PreparedStatement ps=con.prepareStatement("update student2 set name='rameshsunilkumar',branch='MBA' where id=131");

	int i=ps.executeUpdate();
	if(i>0) 
	{
	System.out.println("update");
	}
	else 
	{
	System.out.println("failed to update");
	}
	}
}
