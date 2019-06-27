package jdb;
import java.sql.*;

public class Bank {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
	      Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	      System.out.println("Connect successfully");
	      PreparedStatement p=con.prepareStatement("insert into bank1 values(?,?,?)");
	     p.setInt(1,1005124);
	     p.setString(2,"hello");
	     p.setInt(3,6000);
	     p.setInt(1,1045362);
	     p.setString(2,"hari");
	     p.setInt(3,2000);
	     p.setInt(1,1034214);
	     p.setString(2,"nikki");
	     p.setInt(3,7000);
	     p.setInt(1,134564);
       	p.setString(2,"abcde");
    	p.setInt(3,4000);
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
