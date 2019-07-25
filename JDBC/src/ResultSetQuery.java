import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class ResultSetQuery {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr1","miracle1");
		System.out.println("coneected successfully");
		PreparedStatement ps=c.prepareStatement("select * from lathastud");
		ResultSet r=ps.executeQuery();
		ResultSetMetaData rm=r.getMetaData();
		System.out.println("total number of columns"+rm.getColumnCount());
		System.out.println("total number of names"+rm.getColumnName(1));
		System.out.println("Column Type Name of 1st column: "+rm.getColumnTypeName(1));  
	}

}
