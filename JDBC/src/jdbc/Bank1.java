package jdbc;

import java.sql.*;

public class Bank1 {

public static void main(String[] args)throws ClassNotFoundException,SQLException {
// TODO Auto-generated method stub
Class.forName("com.ibm.db2.jcc.DB2Driver");
     Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr4","miracle4");
     System.out.println("Connect successfully");
     PreparedStatement p=con.prepareStatement("insert into bank437 values(?,?,?)");
    p.setInt(1,10051);
    p.setString(2,"hello");
    p.setInt(3,6000);
    p.setInt(1,10453);
    p.setString(2,"saii");
    p.setInt(3,20000);
    p.setInt(1,10342);
    p.setString(2,"ram");
    p.setInt(3,7000);
    p.setInt(1,13456);
     p.setString(2,"abcde");
      p.setInt(3,4000);
       int i=p.executeUpdate();
     if(i>0)
     {
   	 System.out.println("Data Inserted successfully");
     }
     else
     {
   	 System.out.println("Data insertion failed");
     }
   
con.close();	     
}

}

