import java.util.*;
import java.sql.*;

public class Updated {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter details");
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");
	PreparedStatement ps=con.prepareStatement("update student2 set name=?,branch=? where id=?");
	int id=sc.nextInt();
	String s=sc.next();
	String b=sc.next();
	ps.setString(1,s);
	ps.setString(2,b);
	ps.setInt(3,id);
	int i=ps.executeUpdate();
	if(i>0) 
	{
	System.out.println("Updated successfully");
	}
	else 
	{
	System.out.println("failed to Update");
	}
	}
}
