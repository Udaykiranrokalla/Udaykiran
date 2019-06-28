
import java.sql.*;
import java.util.*;
public class F{

public static void main(String args[]) throws ClassNotFoundException, SQLException {
Class.forName("com.ibm.db2.jcc.DB2Driver");
	
Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle3");
PreparedStatement ps = con.prepareStatement("update miracle4 set name=?,branch=? where id=? ");
System.out.println("enter new name, new branch,id");
Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
String name=sc.next();
String branch=sc.next();
ps.setString(1,name);
ps.setString(2, branch);
ps.setInt(3, id);
//String sql="Delete from reistration" +"where id=85";

ps.executeUpdate();
System.out.println("updated successfully");
}
}