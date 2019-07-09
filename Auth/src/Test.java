

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


public class Test extends HttpServlet {
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	         {
		try (PrintWriter out = response.getWriter()) {
	           Class.forName("com.ibm.db2.jcc.DB2Driver");
	    		Connection c= DriverManager.getConnection("jdbc:db2://172.17.0.142:50001/itgdb","mssusr9","miracle9");
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
	         	        	
	         	        	flag=1;	
                            	         	        			    	        			
	         	        }
	               }
	         		    if(flag==1)
	         		    {
	         		    	out.println("Logged Sucessfully");
	    	                PreparedStatement p=c.prepareStatement("select * from auth where uname=? and pwd=?");
	    	                p.setString(1, email);
	    	                p.setString(2, pass);
	    	        		ResultSet rs=p.executeQuery();
	    	        		String s3="";
	    	        		while(rs.next())
	    	        		{
	    	                 	s3=rs.getString(3);
	    	                 	if(s3.equals("trainer"))
	    	                 	{
	    	         	        	RequestDispatcher req=request.getRequestDispatcher("Home.html");
	         	        			req.include(request, response);

	    	                 	}
	    	                 	else
		    	        		{
	    	         	        	RequestDispatcher req=request.getRequestDispatcher("Trainee.html");
	         	        			req.include(request, response);

		    	        		}

	    	        		}
	    	        		
	         		    }
	         	   	    else
	         	        {
	         	           out.println("Invalid User");
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