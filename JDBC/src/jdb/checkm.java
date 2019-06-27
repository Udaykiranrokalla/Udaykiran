package jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class checkm {
 public static void main(String[]args) throws SQLException, ClassNotFoundException
 {
	 Class.forName("com.ibm.db2.jcc.DB2Driver");
	 Connection Con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	
	 Object insert;
	 PreparedStatement ps=Con.prepareStatement("insert into miraclemom VALUES (112,'Rakesh','Developer')");
	 int i=ps.executeUpdate();
	 System.out.println("rakesh is the kings");
 }

}
