package jdb;

import java.sql.*;
import java.util.Scanner;

public class Ba {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		  Class.forName("com.ibm.db2.jcc.DB2Driver");
	      Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr6","miracle6");
	      System.out.println("Connect successfully");
	      PreparedStatement p1=con.prepareStatement("insert into stu1 values(?,?,?)");
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter accountno and passwprd and amount:");
		     int accno=sc.nextInt();
		     String password=sc.next();
		     int amount=sc.nextInt();
		     p1.setInt(1,accno);
		     p1.setString(2,password);
		     p1.setInt(3,amount);
		     int i=p1.executeUpdate();
		     if(i>0)
		     {
		    	 System.out.println("inserted Successfully");
		     }
		     else
		     {
		    	 System.out.println("insertion failed");
		     }
		     con.close();
	      
	      

	}

}
