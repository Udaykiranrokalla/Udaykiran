package jdb;
import java.sql.*;
public class Delete {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		 Class.forName("com.ibm.db2.jcc.DB2Driver");
	     Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	     System.out.println("Connect successfully");
	     String s1="DELETE FROM stu1 where id=?";
	     PreparedStatement p=con.prepareStatement(s1);
	     p.setInt(1, 12);
	     int z=p.executeUpdate();
	     if(z>0)
	     {
	    	 System.out.println("deleted");
	     }
	     else
	     {
	    	 System.out.println("not deleted");
	     }
	     con.close();
	}

}
