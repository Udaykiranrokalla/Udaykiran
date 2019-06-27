import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Check1
{
   public static void main (String args[]) throws SQLException, ClassNotFoundException
   {
	   Scanner s=new Scanner(System.in);
	   Class.forName ("com.ibm.db2.jcc.DB2Driver");
	   Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr4","miracle4");
     System.out.println("connection successful");
     Object insert;
	PreparedStatement PS=con.prepareStatement("insert into  student999 values (14,'hari','palasa',98763536)");
	int i = PS.executeUpdate();
   }
}
