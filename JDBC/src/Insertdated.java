import java.util.*;
import java.sql.*;

public class Insertdated {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter details");
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");
	PreparedStatement ps=con.prepareStatement("insert into student2 values(?,?,?)");
	int id=sc.nextInt();
	String s=sc.next();
	String b=sc.next();
	ps.setInt(1,id);
	ps.setString(2,s);
	ps.setString(3,b);
	int i=ps.executeUpdate();
	if(i>0) 
	{
	System.out.println("insert successfully");
	}
	else 
	{
	System.out.println("failed to insert");
	}
	}
}
