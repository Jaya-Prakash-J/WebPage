

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HttpServlet")
public class HttpServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.println("<html><head><title> My Http Servlet</title></head>");
		out.println("<body> This is My Http Servlet - Get Request</body></html>");
		
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		out.println("<html><head><title> My Http Servlet</title></head>");
		out.println("<body>This is My Http Servlet - Post Request</body></html>");
		
		
	}

}
