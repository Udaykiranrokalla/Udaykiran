package jdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertstatic {
	 public static void main(String[]args) throws SQLException, ClassNotFoundException
	 {
		 Class.forName("com.ibm.db2.jcc.DB2Driver");
		 Connection Con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
		 PreparedStatement ps=Con.prepareStatement("insert into miraclemom VALUES (?,?,?)");
		 ps.setInt(1,221);
		 ps.setString(2,"mom");
		 ps.setString(3,"angulardeveloper");
		 int i=ps.executeUpdate();
		 System.out.println("rakesh is the king");
	 }

}
