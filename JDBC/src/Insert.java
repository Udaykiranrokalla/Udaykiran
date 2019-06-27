import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Insert {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int id;
		String name,salary;
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr2","miracle2");
		System.out.println("coneected successfully");
		System.out.println("enter id,name,salary");
		id=s.nextInt();
        name=s.next();
        salary=s.next();
        PreparedStatement ps=c.prepareStatement("insert into jhanu3 values (?,?,?)");
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setString(3,salary);
		
        int i=ps.executeUpdate();
        if(i>0)
        { 
        	System.out.println("successfully data entered");
        }
        else
        {
        	System.out.println("failed");

        }
	}

}

