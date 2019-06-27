import java.util.*;

import java.sql.*;
public class delete 
 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection c=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr2 ", "miracle2");
	System.out.println("connected successfully");
	PreparedStatement ps=c.prepareStatement("Delete from jhanu3  where id=?");
	System.out.println("enter id");
	Scanner sc=new Scanner(System.in);
	int id=sc.nextInt();
	ps.setInt(1,id);
	ps.executeUpdate();
	//ResultSet r=ps.executeQuery() ;
    //while(r.next())
    //{
    System.out.println("deleted successfully");	
	
	}
 }
	 
	 
	
 

	
	


