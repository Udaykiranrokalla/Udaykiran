package jdbc;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class Check2 {
	public static void main(String args[])throws ClassNotFoundException, SQLException
	 {
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr4", "miracle4");
	System.out.println("Connection succesfully");
	//System.out.println("enter Student details");
	PreparedStatement ps=con.prepareStatement("Insert into Student55 values(?,?,?,?)");
	ps.setInt(1, 511);
	ps.setString(2, "sai");
	ps.setString(3, "palakollu");
	ps.setInt(4, 9874563);
	int z=ps.executeUpdate();
	if(z>0)
	{

	System.out.println("successfully");
	}
	else
	System.out.println("not successfully");
	con.close();

	}


	}
