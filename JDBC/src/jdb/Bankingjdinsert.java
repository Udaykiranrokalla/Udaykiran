package jdb;
import java.sql.*;
public class Bankingjdinsert {
	


	public static void main(String[] args)throws ClassNotFoundException,SQLException {
	// TODO Auto-generated method stub
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	     Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	     System.out.println("Connect successfully");
	     PreparedStatement p=con.prepareStatement("insert into bankopt1 values(?,?,?)");
	    p.setInt(1,112011);
	    p.setString(2,"rock");
	    p.setInt(3,66000);
	    p.setInt(1,112012);
	    p.setString(2,"ijwos");
	    p.setInt(3,76000);
//	    p.setInt(1,112013);
//	    p.setString(2,"manu");
//	    p.setInt(3,42000);
	    
	       int i=p.executeUpdate();
	     if(i>0)
	     {
	   	 System.out.println("Data Inserted successfully");
	     }
	     else
	     {
	   	 System.out.println("Data insertion failed");
	     }
	   
	con.close();	     
	}

	}

