import java.sql.*;


public class Check
{
   public static void main(String ags[]) throws ClassNotFoundException, SQLException
   {
	   Class.forName("com.ibm.db2.jcc.DB2Driver");
       Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr5","miracle5");
       System.out.println("Connection successful");
       PreparedStatement ps=con.prepareStatement("insert into student22 values(?,?,?)");
       ps.setInt(1,4513);
       ps.setString(2,"harry");
       ps.setInt(3,123014);
       int z=ps.executeUpdate();
       if(z>0)
       {
    	   System.out.println("successful");
       }
       else
    	   System.out.println("not successful");
      con.close();
    }
}
