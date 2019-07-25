
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Player {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no,id,phone;
		String firname,lastname;
		System.out.println("enter player data: id,firname,lastname");
		no=sc.nextInt();
		firname=sc.next();
		lastname=sc.next();
//		phone=sc.nextInt();
		Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr1","miracle1");
		  PreparedStatement ps=con.prepareStatement("Select * from player where id=? and fname=? and lname=?");
//			PreparedStatement ps=con.prepareStatement("Delete From lathastud where no=?");
			ps.setInt(1,no);
			ps.setString(2,firname);
			ps.setString(3,lastname);
//			ps.setInt(4,phone);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
	            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}
			
	}	
	}
	
	


