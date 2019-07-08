package hari;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Trainer extends HttpServlet {
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	         {
		try (PrintWriter out = response.getWriter()) {
	           Class.forName("com.ibm.db2.jcc.DB2Driver");
	    		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr9","miracle9");
	    		System.out.println("connected successfully");
	    		response.setContentType("text/html;charset=UTF-8");
               String email = request.getParameter("option");
               int v=Integer.parseInt(email);	
           	switch(v)
		   	{
		   	
		   	case 1:
		   	{
		   		RequestDispatcher req=request.getRequestDispatcher("Insert.html");
     			req.include(request, response);
		   	
			}
		   	
		   	break;
		   	
		   	case 2 :
		     	{
		     		RequestDispatcher req=request.getRequestDispatcher("Update.html");
	     			req.include(request, response);
		     		
		     		
        	    }
		     	break;
		   	    
		   	case 3 :
		   	{   
		   		RequestDispatcher req=request.getRequestDispatcher("Delete.html");
     			req.include(request, response);
		   		
		   	}
		   	break;
		   	
		   	case 4 :
		   	{
		   		RequestDispatcher req=request.getRequestDispatcher("Show.html");
     			req.include(request, response);

		   	}break;
		   	
		        default :
		   	System.out.println("Invalid option");
		   	
		   	
		}
               
               
		}
	            catch(Exception e)
	            {
	            	System.out.println(e);
	            }


	         }
}