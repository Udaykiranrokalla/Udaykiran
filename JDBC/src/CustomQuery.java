import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
	 class Isb extends Exception{
			Isb(String s){
				super(s);
			}
	 }
	 class Inp extends Exception{
		 Inp(String p){
			 super(p);
		 }
	 }
	class InvDeposit extends Exception{
		InvDeposit(String b)
		{
		  super(b);	
		}
		}
public class CustomQuery {
	public static void main(String[] args) throws Isb,Inp,InvDeposit,ClassNotFoundException,SQLException {
		Class.forName("com.ibm.db2.jcc.DB2Driver");
		Connection con=DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr1","miracle1");
				System.out.println("connected successfully");

    Scanner sc=new Scanner(System.in);
    System.out.println(" enter Account number and password");
        String p=sc.next();

        PreparedStatement ps=con.prepareStatement("Select * from lathabank where p=?");

    int a=0;
    int d=0,w=0;

        ResultSet r=ps.executeQuery();
    if(r.next()) {
    while(true)
    {    System.out.println("enter your choice 1.withdraw 2.amount 3.deposit 4. exit");
         int n=sc.nextInt();
    
      switch(n) {

    case 1:System.out.println("withdraw");
           System.out.println("enter amount");
            w=sc.nextInt();
            PreparedStatement ps1=con.prepareStatement("insert into lathabank set w=? where p=?");
            ps1.setInt(2,a); 
            ResultSet rs=ps1.executeQuery();
             if(rs.next()) {
            	 a=rs.getInt("a");
             }
            if(a<w) {
        	   throw new Isb("isb");
           }
           else
           {
        	   PreparedStatement pp=con.prepareStatement("update lathabank set a=? where p=?");
				pp.setString(1, p);
				pp.setInt(3, a-w);
	    		int j=pp.executeUpdate();
				if(j>0)
	    		{   
					
	    			System.out.println("balance withdrawn availabale balance is:");
	    			PreparedStatement rb=con.prepareStatement("select a from lathabank where p=?");
                   rb.setString(1, p);
       			ResultSet rss=rb.executeQuery();
       			while(rss.next()) {
       	            int rbal=rss.getInt("a");
                       System.out.println(rbal);
       			}
	    		}
	    		

              a=a-w;
        	System.out.println("remaining amount="+a);
           }

                       int k1=ps.executeUpdate();
                   	if(k1>0) {
                   		System.out.println("success fully updated");
                   	}
                    PreparedStatement pd=con.prepareStatement("select * from lathabank"); 	
           break;
    
    case 2:System.out.println("deposit");
              d=sc.nextInt();
              PreparedStatement gg=con.prepareStatement("select * from lathabank where p=?");
              gg.setString(1, p);
              ResultSet rss=gg.executeQuery();
              if(rss.next()) {
	            int rbal=rss.getInt("a");
	            System.out.println("enter amount you want to deposit");
		   	    int depobal=sc.nextInt();
		   		PreparedStatement pp=con.prepareStatement("update lathabank set a=? where p=?");
		   		 a= rbal+depobal;
		   		pp.setString(1, p);
		   	    pp.setInt(2, a);
	    		int k=pp.executeUpdate();
	    		if(k>0)
	    		{
	    			System.out.println("balance deposited successfully.Available a is "+a);
	    		}
              }

     case 3:
    	System.out.println("amount="+a);
    	PreparedStatement rb=con.prepareStatement("select a from lathabank where p=?");
        rb.setString(1, p);
        ResultSet rs1=rb.executeQuery();
		if(rs1.next()) {
            int rbal=rs1.getInt("a");
            System.out.println(rbal);
		}

    	break;
    
   case 4:System.out.println("exit");
           break;
    default:
    	   System.out.println("invalid choice");
    }
  
    
    }
	}
}
}

