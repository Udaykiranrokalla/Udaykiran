import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Check3

{

public static void main(String[] args) throws ClassNotFoundException, SQLException
{
           Class.forName("com.ibm.db2.jcc.DB2Driver");
      Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr4","miracle4");
      System.out.println("Connection successful");
      System.out.println("enter student details");
      PreparedStatement ps=con.prepareStatement("insert into student999 values(?,?,?,?)");
      Scanner scan=new Scanner(System.in);
      int id=scan.nextInt();
      String name=scan.next();
      String place=scan.next();
      int phonenumber=scan.nextInt();
           ps.setInt(1,id);
           ps.setString(2,name);
           ps.setString(3,name);
           ps.setInt(4,phonenumber);
           int z=ps.executeUpdate();
           if(z>0)
           {
          System.out.println("successful insertion");
           }
           else
          System.out.println("not successful");

}

}