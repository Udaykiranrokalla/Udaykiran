package jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Check {

	public static void main(String[] args) throws ClassNotFoundException,SQLException  {
		// TODO Auto-generated method stub
		
      Class.forName("com.ibm.db2.jcc.DB2Driver");
      Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
      System.out.println("Connect successfully");
	
		
		}

}
