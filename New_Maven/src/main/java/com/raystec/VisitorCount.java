package com.raystec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisitorCount
 */
@WebServlet (urlPatterns = "/VisitorCount")
public class VisitorCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitorCount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletContext ctx = getServletContext();
		Integer count = (Integer) ctx.getAttribute("visitCount");
		
		if(count==null) {
			count=1;
		}else {
			count++;
		}
	ctx.setAttribute("visitCount", count);
	
	PrintWriter out = response.getWriter();
	out.println("<html><body>");
	out.println("<h1>Visitor Count;" + count + "/h1");
	out.println("</body></html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
