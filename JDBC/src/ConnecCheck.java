import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class ConnecCheck {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
Scanner sc=new Scanner(System.in);
int no,age;
String name,branch;
System.out.println("enter Student data: id,name,age,branch ");
no=sc.nextInt();
name=sc.next();
age=sc.nextInt();
branch=sc.next();
Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr1","miracle1");
  PreparedStatement ps=con.prepareStatement("insert into lathastud values(?,?,?,?)");
//	PreparedStatement ps=con.prepareStatement("Delete From lathastud where no=?");
	ps.setInt(1, no);
	ps.setString(2,name);
	ps.setInt(3, age);
	ps.setString(4,branch);
	int k=ps.executeUpdate();
	if(k>0) {
		System.out.println("success fully updated");
	}else {
  System.out.println("failed");
	
}
}
}
