package com.raystec;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForgotPasswordCTL
 */
public class ForgotPasswordCTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegistrationBean bean = new RegistrationBean();
		bean.setLoginid(request.getParameter("emailid"));
		
		RegistrationModel m = new RegistrationModel();
		
		try {
			bean=m.forgotPassword(bean);
			if (bean.getPassword()!=null) {
				RequestDispatcher rd = request.getRequestDispatcher("/ShowMyPassword.jsp");
				request.setAttribute("pass", bean.getPassword());
				
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("/ForgotPassword.jsp");
				request.setAttribute("error", "Invalid Email id");
				rd.forward(request, response);
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}

}
