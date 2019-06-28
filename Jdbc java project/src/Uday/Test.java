package Uday;
import java.sql.*;
import java.util.*;
public class Test {

public static void main(String[] args)throws ClassNotFoundException,SQLException {
Class.forName("com.ibm.db2.jcc.DB2Driver");
Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle3");
System.out.println("Connect successfully");
System.out.println("Enter id,firstname and lastname:");
Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
String fname=sc.next();
String lname=sc.next();
PreparedStatement ps=con.prepareStatement("select * from v where id=? or fname=? or lname=?");
ps.setInt(1,id);
ps.setString(2,fname);
ps.setString(3,lname);
ResultSet rs=ps.executeQuery();
while(rs.next()){
System.out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+ " "+rs.getString(4));
}
con.close(); 
}
}
