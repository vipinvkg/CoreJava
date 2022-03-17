package com.raystec;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/hello", "/first", "/test", "*.do" })
public class Hello_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.getWriter().append("").append(request.getContextPath());

		RegistrationBean bean = new RegistrationBean();
		bean.setFname(request.getParameter("fname"));
		bean.setLname(request.getParameter("lname"));
		bean.setLoginid(request.getParameter("id"));
		bean.setPassword(request.getParameter("pd"));
		bean.setConpassword(request.getParameter("cpwd"));
		bean.setGender(request.getParameter("gen"));
		bean.setDob(request.getParameter("dob"));
		
		RegistrationModel model =new RegistrationModel();
		try {
			model.add(bean);
			PrintWriter out = response.getWriter();
			out.print("Thanks to Register");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
				}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
