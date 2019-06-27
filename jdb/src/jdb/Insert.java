package jdb;
import java.sql.*;


public class Insert {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		 Class.forName("com.ibm.db2.jcc.DB2Driver");
	      Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	      System.out.println("Connect successfully");
	      PreparedStatement p=con.prepareStatement("insert into stu1 values(?,?)");
	      p.setInt(1,11);
	      p.setString(2,"Harry");
	      p.setInt(1,12);
	      p.setString(2,"Gp");
	      p.setInt(1,13);
	      p.setString(2,"ganesh");
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
