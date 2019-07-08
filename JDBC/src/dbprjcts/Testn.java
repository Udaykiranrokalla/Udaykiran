package dbprjcts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Testn {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection c= DriverManager.getConnection("jdbc:db2://192.168.1.21:50000/mss_db2","db2test","db2test");
	System.out.println("coneected successfully");
}
}
