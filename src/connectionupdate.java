import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connectionupdate {
public static void main(String args[]) throws ClassNotFoundException, SQLException
{
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con = DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr7","miracle7");
	System.out.println("get connection");
	System.out.println("pls enter emp_id:\nuser name:\ngmail: ");
	Scanner obj=new Scanner(System.in);
	int id=obj.nextInt();
	String s=obj.next();
	String s2=obj.next();
	PreparedStatement pst = con.prepareStatement("update employess set emp_gmail=?,username=? where emp_id=? ");
	pst.setString(1,s2);
	pst.setString(2,s);
	pst.setInt(3,id);
	int a=pst.executeUpdate();
	if(a>0)
	{
	System.out.print("Data deleted successfully");
	}
	else
	System.out.print("\nData insertion failed");
	con.close();
	}
    
}
