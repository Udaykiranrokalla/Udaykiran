
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class Dynamic {

public static void main(String args[]) throws ClassNotFoundException, SQLException {
Class.forName("com.ibm.db2.jcc.DB2Driver");
	
Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle3");
PreparedStatement ps = con.prepareStatement("insert into miracle4 values(?,?,?)");
System.out.println("enter id,name,branch");
Scanner sc=new Scanner(System.in);
int id =sc.nextInt();
String s=sc.next();
String s1=sc.next();
ps.setInt(1, id);
ps.setString(2,s);
//String sql="Delete from reistration" +"where id=85";
ps.setString(3, s1);
ps.executeUpdate();
System.out.println("inserted successfully");
}
}