package urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/u1")

public class url extends HttpServlet 
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		//rajesh jjjjjjj
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		
		out.println("<a href='u2?uname="+user+"'>visit</a>");
	}
}
