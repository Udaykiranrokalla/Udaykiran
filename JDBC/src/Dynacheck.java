import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Dynacheck {
	public static void main(String args[])throws ClassNotFoundException, SQLException
	 {
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr5", "miracle5");
		System.out.println("Connection succesfully");
		System.out.println("enter employee details");
		//PreparedStatement ps=con.prepareStatement("Insert into emp347 values(?,?,?)");
		//PreparedStatement ps=con.prepareStatement("delete from emp347 where empno=?");
		PreparedStatement ps=con.prepareStatement("Update emp347 SET empno=?,empname=? where job=?");
		Scanner scan=new Scanner(System.in);
		int empno=scan.nextInt();
		String empname=scan.next();
		String job=scan.next();
		ps.setInt(1, empno);
		ps.setString(2, empname);
		ps.setString(3, job);
		int z=ps.executeUpdate();
		if(z>0)
		{
			System.out.println("Successfull insertion");
		}else
			System.out.println(" not Successfull insertion");
		}
}

		
