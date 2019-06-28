package jdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Cricketjdb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
		System.out.println("connected successfully");
		System.out.println("enter jno,name,surname,location:");
		Scanner sc=new Scanner(System.in);
		int jno=sc.nextInt();
		String name=sc.next();
		String surname=sc.next();
		String location=sc.next();
		PreparedStatement ps=c.prepareStatement("Select * from cricket where id=? and fname=? and lname=?");
        ps.setInt(1, jno);
        ps.setString(2,name);
     	ps.setString(3,surname);
     	ps.setString(3,location);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}




	}

}
