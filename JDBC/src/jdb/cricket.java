package jdb;

import java.sql.*;
public class cricket {
	
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
	// TODO Auto-generated method stub
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	     Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	     System.out.println("Connect successfully");
	     PreparedStatement p=con.prepareStatement("insert into  Cricketi values(?,?,?,?)");
	    p.setInt(1,7);
	    p.setString(2,"Dhoni");
	    p.setString(3,"keeper");
	    p.setString(4,"Chandigarh");
	    p.setInt(1,18);
	    p.setString(2,"Kohli");
	    p.setString(3,"captain");
	    p.setString(4,"Bangalore");
	    p.setInt(1,12);
	    p.setString(2,"Yuvi");
	    p.setString(3,"allrounder");
	    p.setString(4,"Punjab");
	    
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

