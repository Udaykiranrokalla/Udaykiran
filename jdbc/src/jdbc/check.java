package jdbc;
import java.util.*;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class check {
public static void main(String args[])throws ClassNotFoundException,SQLException {
	Scanner sc=new Scanner(System.in);
	int id,age;
	String name,branch;
	System.out.println("enter id");
	id=sc.nextInt();

	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");
	
	System.out.println("db connected");
PreparedStatement stmt=con.prepareStatement("delete from syamu where id=? "); 
	 
stmt.setInt(1,id);//1 specifies the first parameter in the query  
//	stmt.setString(2,name); 
//	[='-694578584214657stmt.setInt(3,age);
	 
	  
	int i=stmt.executeUpdate();  
	if(i>0) {
	System.out.println(" deleted successfully");  
	  
}
	else
	{
		System.out.println("failed");
	}
}
}