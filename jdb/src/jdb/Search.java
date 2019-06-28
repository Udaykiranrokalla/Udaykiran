package jdb;
import java.sql.*;
import java.util.*;
public class Search {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.ibm.db2.jcc.DB2Driver");
	     Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	     System.out.println("Connect successfully");
	     System.out.println("Enter id,firstname and lastname:");
	     Scanner sc=new Scanner(System.in);
	     int id=sc.nextInt();
	     String fname=sc.next();
	     String lname=sc.next();
	     PreparedStatement ps=con.prepareStatement("select * from employ where id=?");
	     ps.setInt(1,id);
	    // ps.setString(2,fname);
	     //ps.setString(3,lname);
	     
	     ResultSet rs=ps.executeQuery();
	     do
	     {
	   if(rs.getInt(id)==id)
	   {
		System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4)+""+rs.getString(5));
		  	
	   }
	     }while(rs.next());
	     
	   con.close();  
	}

}
