import java.sql.*;
import java.util.*;
public class D{

public static void main(String args[]) throws ClassNotFoundException, SQLException {
Class.forName("com.ibm.db2.jcc.DB2Driver");
	
Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle3");
PreparedStatement ps = con.prepareStatement("update miracle set name='uk',branch='cse' where id=33 ");
int i=ps.executeUpdate();
//while(i.next())
//System.out.println(i.getInt(1)+ " " +i.getString(2)+ " " +i.getString(3));
if(i>0) {
System.out.println("updated successfully");
}
else {
	System.out.println("failed to update");
}
}
}