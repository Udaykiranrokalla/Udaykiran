



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Trainee extends HttpServlet {
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	         {
		try (PrintWriter out = response.getWriter()) {
	           Class.forName("com.ibm.db2.jcc.DB2Driver");
	    		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr9","miracle9");
	    		System.out.println("connected successfully");
	    		String uname = request.getParameter("uname");
                
	                PreparedStatement ps=c.prepareStatement("select * from auth where uname=?");
	                ps.setString(1,uname);
	               
	        		ResultSet r=ps.executeQuery();
	                if(r.next())
	                {
	                	out.println("User Data is....");
	                	out.println(r.getString(1)+" "+r.getString(2)+" "+r.getString(3));
	                	RequestDispatcher req=request.getRequestDispatcher("Trainee.html");
	                			req.include(request, response);
	                }
	                else
	                {
	                	out.println("Something went wrong please try again");
	                	RequestDispatcher req=request.getRequestDispatcher("Trainee.html");
	                			req.include(request, response);
	                }
	        			        	     		        		
	        			                    
	            }
	            catch(Exception e)
	            {
	            	System.out.println(e);
	            }
}
}