import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr1","miracle1");
		System.out.println("coneected successfully");
		System.out.println("enter your choice to update 1)no 2)name 3)age 4)branch");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		switch(n)
		{
		case 1 :{
			System.out.println("enter new no and old no");
			int newno=s.nextInt();
			int no=s.nextInt();
			PreparedStatement ps=c.prepareStatement("update lathastud set no=? where no=?");
            ps.setInt(1,newno);
            ps.setInt(2,no);
    		System.out.println("Query Executed Successfully");
    		int i=ps.executeUpdate();
    		if(i>0)
    		{
    			System.out.println("updated  successfully");
    		}
    		break;
		}
		
		case 2 :
		{
			System.out.println("enter no and enter new name");
			int no=s.nextInt();
			String name=s.next();
			PreparedStatement ps=c.prepareStatement("update lathastud set name=? where no=?");
            ps.setInt(1,no);
            ps.setString(2,name);
    		System.out.println("Query Executed Successfully");
    		int i=ps.executeUpdate();
    		if(i>0)
    		{
    			System.out.println("updated  successfully");
    		}
    		break;
		}
		case 3 :
		{
			System.out.println("enter no and enter new branch");
			int no=s.nextInt();
			String branch=s.next();
			PreparedStatement ps=c.prepareStatement("update lathastud set branch=? where no=?");
            ps.setInt(1,no);
            ps.setString(4,branch);
    		System.out.println("Query Executed Successfully");
    		int i=ps.executeUpdate();
    		if(i>0)
    		{
    			System.out.println("updated  successfully");
    		}
    		break;
	}	
		case 4 :{
			System.out.println("enter no and new age");
			int no=s.nextInt();
			int age=s.nextInt();
			PreparedStatement ps4=c.prepareStatement("update lathastud set age=? where no=?");
            ps4.setInt(1,no);
            ps4.setInt(3,age);
    		System.out.println("Query Executed Successfully");
    		int i=ps4.executeUpdate();
    		if(i>0)
    		{
    			System.out.println("updated  successfully");
    		}
    		
		
				
		
		}
		
	}
	}

}
