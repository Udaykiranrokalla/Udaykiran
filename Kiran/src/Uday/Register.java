package Uday;



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


public class Register extends HttpServlet {
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	         {
		try (PrintWriter out = response.getWriter()) {
	           Class.forName("com.ibm.db2.jcc.DB2Driver");
	    		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr9","miracle9");
	    		System.out.println("connected successfully");
	    		String uname = request.getParameter("uname");
                String pass = request.getParameter("pass");
	                PreparedStatement ps=c.prepareStatement("insert into auth values(?,?)");
	                ps.setString(1,uname);
	                ps.setString(2,pass);
	        		int i=ps.executeUpdate();
	                if(i>0)
	                {
	                	out.println("Registered Sucessfully");
	                	RequestDispatcher req=request.getRequestDispatcher("Home.html");
	                			req.include(request, response);
	                }
	                else
	                {
	                	out.println("Something went wrong please try again");
	                	RequestDispatcher req=request.getRequestDispatcher("Register.html");
	                			req.include(request, response);
	                }
	        			        	     		        		
	        			                    
	            }
	            catch(Exception e)
	            {
	            	System.out.println(e);
	            }
}
}