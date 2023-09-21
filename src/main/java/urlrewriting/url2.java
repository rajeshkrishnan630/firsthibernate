package urlrewriting;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/u2")

public class url2 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		PrintWriter out=response.getWriter();
		String user1=request.getParameter("uname");
		out.println("Welcome!!!");
		out.println("UserName is:"+user1);
	}

}
