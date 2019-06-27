import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Check4

{

public static void main(String[] args) throws ClassNotFoundException, SQLException
{
           Class.forName("com.ibm.db2.jcc.DB2Driver");
      Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr4","miracle4");
      System.out.println("Connection successful");
      System.out.println("enter id to delete");
      PreparedStatement ps=con.prepareStatement("delete from student999 where id=?");
      Scanner scan=new Scanner(System.in);
      int id=scan.nextInt();
      
           ps.setInt(1,id);
           
           int z=ps.executeUpdate();
           if(z>0)
           {
          System.out.println("successful deleted");
           }
           else
          System.out.println("not successful");

}

}