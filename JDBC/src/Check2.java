import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Check2
{
   public static void main (String args[]) throws SQLException, ClassNotFoundException
   {
	   Scanner s=new Scanner(System.in);
	   int id,phonenumber;
	   String name,place;
	   
	   Class.forName ("com.ibm.db2.jcc.DB2Driver");
	   Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr4","miracle4");
     System.out.println("connection successful");
     PreparedStatement PS=con.prepareStatement("insert into  student999 values(?,?,?,?)");
     PS.setInt(1,15);
     PS.setString(2,"vasu");
     PS.setString(3,"vizag");
     PS.setInt(4,648977861);
     int i = PS.executeUpdate();
	if(i>0)
	{
		System.out.println("inserted");
	}
	else
	{
		System.out.println("not inserted");
	}
   }
}
