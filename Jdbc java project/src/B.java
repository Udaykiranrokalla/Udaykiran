import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class B {

public static void main(String args[]) throws ClassNotFoundException, SQLException {
Class.forName("com.ibm.db2.jcc.DB2Driver");
	
Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle3");
PreparedStatement ps = con.prepareStatement("Delete from miracle4 where id=?");
System.out.println("enter id");
Scanner sc=new Scanner(System.in);
int id =sc.nextInt();
ps.setInt(1, id);
ps.executeUpdate();
System.out.println("Deleted successfully");
}
}