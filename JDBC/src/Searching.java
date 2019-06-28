import java.util.*;
import java.sql.*;
public class Searching {
	int a=0,b,c,d=0,e;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");
	PreparedStatement ps=con.prepareStatement("select * from sunil where name 'ramesh'");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("enter id");
	Scanner sc1=new Scanner(System.in);
	String b=sc.next();
	System.out.println("enter firstname");
	Scanner sc2=new Scanner(System.in);
	String c=sc2.next();
	System.out.println("enter lastname");
	Scanner sc3=new Scanner(System.in);
	int d=sc3.nextInt();
	System.out.println("enter phno");
	Scanner sc4=new Scanner(System.in);
	String e=sc4.next();
	System.out.println("enter address");
	ResultSet i=ps.executeQuery();
	System.out.println("searching succesfully");
	}
	}
