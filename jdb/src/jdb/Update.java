package jdb;
import java.sql.*;
public class Update {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
	    Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	
	    PreparedStatement p=con.prepareStatement("update stu1 set name='sai' where id=14");
	    
	    int d=p.executeUpdate();
	    if(d>0)
	    {
	    	System.out.println("updated");
	    }
	    else 
	    {
	    	System.out.println("not updated");
	    }
	    con.close();
	}

}
