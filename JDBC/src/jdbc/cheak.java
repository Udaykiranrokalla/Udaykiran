package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class cheak
{
   public static void main (String args[]) throws SQLException, ClassNotFoundException
   {
  Class.forName ("com.ibm.db2.jcc.DB2Driver");
  Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr4","miracle4");
     
 
  Object insert;
  PreparedStatement ps=con.prepareStatement("insert into student55 values(437,'sai','ram',957393211)");
  int i= ps.executeUpdate();
  System.out.println("from miracle");
   }
}
