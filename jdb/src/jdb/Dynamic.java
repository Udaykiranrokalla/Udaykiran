package jdb;
import java.sql.*;
import java.util.*;
public class Dynamic {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		 Class.forName("com.ibm.db2.jcc.DB2Driver");
	     Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	     System.out.println("Connect successfully");
	     PreparedStatement p=con.prepareStatement("insert into stu1 values(?,?)");
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter id and name:");
	     int id=sc.nextInt();
	     String name=sc.nextLine();
	     p.setInt(1,id);
	     p.setString(2,name);
	     int i=p.executeUpdate();
	     if(i>0)
	     {
	    	 System.out.println("inserted Successfully");
	     }
	     else
	     {
	    	 System.out.println("insertion failed");
	     }
	     con.close();
	}

}
