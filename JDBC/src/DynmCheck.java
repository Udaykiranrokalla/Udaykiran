import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynmCheck 

{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
           Class.forName("com.ibm.db2.jcc.DB2Driver");
	       Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr5","miracle5");
	       System.out.println("Connection successful");
	       System.out.println("enter student details");
	    //   PreparedStatement ps=con.prepareStatement("insert into student22 values(?,?,?)");
	       //PreparedStatement ps=con.prepareStatement("delete from student22 where sno=?");
	       PreparedStatement ps=con.prepareStatement("update student22 set sno=?,sname=? where phno=?");
	       Scanner scan=new Scanner(System.in);
	       int sno=scan.nextInt();
	       String sname=scan.next();
	       int phno=scan.nextInt();
	      ps.setString(2,sname);
	      ps.setInt(3,phno);
	      ps.setInt(1,sno);
           int z=ps.executeUpdate();
           if(z>0)
           {
        	   System.out.println("successful insertion");
           }
           else
        	   System.out.println("not successful");

	}

}
