

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Simple
 */
@WebServlet("/Simple")
public class Simple extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		          
		int id=Integer.parseInt(request.getParameter("id")); 
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));  
		
		          
		try{  
		Class.forName("com.ibm.db2.jcc.DB2Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:db2://172.17.0.142:50001/itgdb","mssusr13","miracle13");  
		  
		PreparedStatement ps=con.prepareStatement(  
		"insert into spring values(?,?,?)");  
		  
		ps.setInt(1,id);  
		ps.setString(2,name);  
		ps.setInt(3,age);  
		
		          
		int i=ps.executeUpdate();  
		if(i>0)  
		out.print("You are successfully registered...");  
		      
		          
		}catch (Exception e2) {System.out.println(e2);}  
		          
		out.close();  
		}  
		  
}