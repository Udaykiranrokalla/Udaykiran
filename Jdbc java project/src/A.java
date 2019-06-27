import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class A {

public static void main(String args[]) throws ClassNotFoundException, SQLException {
Class.forName("com.ibm.db2.jcc.DB2Driver");
	
Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle3");
PreparedStatement ps = con.prepareStatement("delete from miracle4 where id=23");

int i=ps.executeUpdate();

	System.out.println("Deleted successfully");

}
}