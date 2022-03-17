package com.raystec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="RegistrationCTL",urlPatterns = "/RegistrationCTL")
public class RegistrationCTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RegistrationBean bean = new RegistrationBean();
		
		RegistrationModel model =new RegistrationModel();
		
		if  (request.getParameter("fname")== "") {
			RequestDispatcher rd = request.getRequestDispatcher("/UserRegistratioView.jsp");
			request.setAttribute("fn", "Firstname is required");
			rd.forward(request, response);
			return;
		}else if (request.getParameter("lname")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("/UserRegistratioView.jsp");
			request.setAttribute("ln", "Lastname is required");
			rd.forward(request, response);
			return;
		}else if (request.getParameter("id")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("/UserRegistratioView.jsp");
			request.setAttribute("id", "Login id is required");
			rd.forward(request, response);
			return;
		}else if (request.getParameter("pd")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("/UserRegistratioView.jsp");
			request.setAttribute("pw", "Password is required");
			rd.forward(request, response);
			return;
		}else if (request.getParameter("cpwd")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("/UserRegistratioView.jsp");
			request.setAttribute("cpw", "confirm password is required");
			rd.forward(request, response);
			return;
		}else if (request.getParameter("dob")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("/UserRegistratioView.jsp");
			request.setAttribute("db", "DOB is required");
			rd.forward(request, response);
			return;
		
		}
		
		
		else {bean.setFname(request.getParameter("fname"));
		bean.setLname(request.getParameter("lname"));
		bean.setLoginid(request.getParameter("id"));
		bean.setPassword(request.getParameter("pd"));
		bean.setConpassword(request.getParameter("cpwd"));
		bean.setGender(request.getParameter("gen"));
		bean.setDob(request.getParameter("dob"));
		

		}
		try {
			model.add(bean);
			PrintWriter out = response.getWriter();
			out.print("Thanks to Register");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
