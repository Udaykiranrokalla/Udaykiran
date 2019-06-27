package jdb;
import java.sql.*;
public class Result {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.ibm.db2.jcc.DB2Driver");
	     Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	     System.out.println("Connect successfully");
	     Statement stmt=con.createStatement();
	     ResultSet rs=stmt.executeQuery("select * from stu1");
	     while(rs.next())
	     {
	    	 System.out.println(rs.getInt(1)+" "+rs.getString(2));
	     }
	     con.close();
	}

}
