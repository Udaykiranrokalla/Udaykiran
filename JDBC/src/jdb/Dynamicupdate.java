package jdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Dynamicupdate {
	 public static void main(String[]args) throws SQLException, ClassNotFoundException
	 {
		 Class.forName("com.ibm.db2.jcc.DB2Driver");
		 Connection Con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
		 System.out.println("Enter the values:");
		 PreparedStatement ps=Con.prepareStatement("update miraclemom set ename = ?, domain = ? where eid=?");
		 Scanner rs=new Scanner(System.in);
		 int eid= rs.nextInt();
		 String ename= rs.next();
		 String domain= rs.next();
		 ps.setInt(1,eid);
		 ps.setString(2,ename);
		 ps.setString(3,domain);
		
		 int i=ps.executeUpdate();
		 if(i>0)
		 {
		 System.out.println("update works");
		 }
		 else
			 System.out.println("Doesnt work");
	 }
}
