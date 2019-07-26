package Uday;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.http.*;


public class Auth extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	 try (PrintWriter out = response.getWriter()) {
             Class.forName("com.ibm.db2.jcc.DB2Driver");
      		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr3","miracle9");
      		System.out.println("connected successfully");
                  response.setContentType("text/html;charset=UTF-8");
                  String email = request.getParameter("email");
                  String pass = request.getParameter("pass");
    		PreparedStatement ps=c.prepareStatement("select * from auth");
    		ResultSet r=ps.executeQuery();
    		String s1="";
			String s2="";
			int flag=0;
            while(r.next())
    		{   
            	
            	s1=r.getString(1);
    		    s2=r.getString(2);
    		    if(email.equals(s1) && pass.equals(s2))
    	        {
    	        	
    	        			
    	        			    	        			
    	        }
          }
    		    if(flag==1)
    		    {
    		    	out.println("Logged Sucessfully");
    	        	RequestDispatcher req=request.getRequestDispatcher("Home.html");
    	        			req.include(request, response);
    		    }
    	   	    else
    	        {
    	           out.println("Invalid User");
    	           
    	        }
    		    		
              
            }
        catch(Exception e)
        {
        	System.out.println(e);
        }
    }  
}