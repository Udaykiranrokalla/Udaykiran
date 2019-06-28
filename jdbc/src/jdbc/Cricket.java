package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Cricket {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr9","miracle9");
		System.out.println("coneected successfully");
		System.out.println("enter id,first name,Last name:");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String fname=sc.next();
		String lname=sc.next();
		PreparedStatement ps=c.prepareStatement("Select * from cricket where id=? and fname=? and lname=?");
        ps.setInt(1, id);
        ps.setString(2,fname);
     	ps.setString(3,lname);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}




	}


}
