import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Check5

{

public static void main(String[] args) throws ClassNotFoundException, SQLException
{
           Class.forName("com.ibm.db2.jcc.DB2Driver");
      Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr4","miracle4");
      System.out.println("Connection successful");
      System.out.println("enter id to update");
      PreparedStatement ps=con.prepareStatement("update  student999 set name=? , place=?, phonenumber=? where id=?");
      Scanner scan=new Scanner(System.in);
      int id=scan.nextInt();
      String name=scan.next();
      String place=scan.next();
      int phonenumber=scan.nextInt();
          
           ps.setString(1,name);
           ps.setString(2,place);
           ps.setInt(3,phonenumber);
           ps.setInt(4,id);
           int z=ps.executeUpdate();
           if(z>0)
           {
          System.out.println("successfully updated");
           }
           else
          System.out.println("not successful");

}

}