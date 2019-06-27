import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr1","miracle1");
		System.out.println("coneected successfully");
		System.out.println("enter number of student to delete");
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		PreparedStatement ps=c.prepareStatement("delete from lathastud where no=?");
		ps.setInt(1,no);
		System.out.println("Query Executed Successfully");
		int i=ps.executeUpdate();
		if(i>0)
		{
			System.out.println("deleted succesfully");
		}
	}
}