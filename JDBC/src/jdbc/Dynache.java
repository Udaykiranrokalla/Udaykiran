package jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;
	public class Dynache{
	public static void main(String args[])throws ClassNotFoundException, SQLException
	{
	Class.forName("com.ibm.db2.jcc.DB2Driver");
	Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr4", "miracle4");
	System.out.println("Connection succesfully");
	System.out.println("enter Student details"); 
	//System.out.println("enter id too delete details");
	PreparedStatement ps=con.prepareStatement("Insert into student55 values(?,?,?,?)");
	//PreparedStatement ps=con.prepareStatement("delete from student55 where id=?");
	Scanner scan=new Scanner(System.in);
	int id=scan.nextInt();
	String name=scan.next();
	String place=scan.next();
	int phonenumber=scan.nextInt();
	ps.setInt(1, id);
    ps.setString(2, name);
	ps.setString(3, place);
	ps.setInt(4, phonenumber);
	int z=ps.executeUpdate();
	if(z>0)
	{
	System.out.println("Successfull insertion");
	}else
	System.out.println(" not Successfull");
	}
	}

