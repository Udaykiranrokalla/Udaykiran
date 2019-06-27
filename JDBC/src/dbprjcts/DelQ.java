package dbprjcts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DelQ {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr9","miracle9");
		System.out.println("coneected successfully");
		System.out.println("enter id of student to delete");
		Scanner s=new Scanner(System.in);
		int id =s.nextInt();
		PreparedStatement ps=c.prepareStatement("delete from studentz where sid=?");
		ps.setInt(1,id);
		System.out.println("Query Executed Successfully");
		int i=ps.executeUpdate();
		if(i>0)
		{
//			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getInt(4));
			System.out.println("deleted succesfully");
		}
	}

}
