package dbprjcts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateQ {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr9","miracle9");
		System.out.println("coneected successfully");
		System.out.println("which field u want to update 1)id 2)name 3)branch 4)ph");
		Scanner s=new Scanner(System.in);
		int opt=s.nextInt();
		switch(opt)
		{
		case 1 :{
			System.out.println("enter new id and old id");
			int newid=s.nextInt();
			int oldid=s.nextInt();
			PreparedStatement ps=c.prepareStatement("update studentz set sid=? where sid=?");
            ps.setInt(1,newid);
            ps.setInt(2,oldid);
    		System.out.println("Query Executed Successfully");
    		int i=ps.executeUpdate();
    		if(i>0)
    		{
//    			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getInt(4));
    			System.out.println("updated  successfully");
    		}
    		break;
		}
		case 2 :{
			System.out.println("enter id and enter new name");
			int id=s.nextInt();
			String newn=s.next();
			PreparedStatement ps=c.prepareStatement("update studentz set sname=? where sid=?");
            ps.setString(1,newn);
            ps.setInt(2,id);
    		System.out.println("Query Executed Successfully");
    		int i=ps.executeUpdate();
    		if(i>0)
    		{
//    			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getInt(4));
    			System.out.println("updated  successfully");
    		}
    		break;
		}
		case 3 :{
			System.out.println("enter id and enter new branch");
			int id=s.nextInt();
			String branch=s.next();
			PreparedStatement ps=c.prepareStatement("update studentz set sbranch=? where sid=?");
            ps.setString(1,branch);
            ps.setInt(2,id);
    		System.out.println("Query Executed Successfully");
    		int i=ps.executeUpdate();
    		if(i>0)
    		{
//    			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getInt(4));
    			System.out.println("updated  successfully");
    		}
    		break;
		}
		case 4 :{
			System.out.println("enter id and new ph");
			int id=s.nextInt();
			int ph=s.nextInt();
			PreparedStatement ps=c.prepareStatement("update studentz set sph=? where sid=?");
            ps.setInt(1,ph);
            ps.setInt(2,id);
    		System.out.println("Query Executed Successfully");
    		int i=ps.executeUpdate();
    		if(i>0)
    		{
//    			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getInt(4));
    			System.out.println("updated  successfully");
    		}
    		break;
		}
				
		
		}
		
		
	}

}
