package com.raystec;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginCtl", urlPatterns = "/LoginCtl")
public class LoginCTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginCTL() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RegistrationBean bean = new RegistrationBean();
		bean.setLoginid(request.getParameter("user"));
		bean.setPassword(request.getParameter("pwd"));
		
		RegistrationModel m = new RegistrationModel();
		try {
		if (bean.getLoginid()== "") {
			RequestDispatcher rd = request.getRequestDispatcher("/LoginView.jsp");
			request.setAttribute("loginreq", "login id is required");
			request.setAttribute("passreq", "password is required");		
			rd.forward(request, response);
			return;

		} else {

			
				bean = m.authent(bean);

				if (bean.getFname() == null) {
					RequestDispatcher rd = request.getRequestDispatcher("/LoginView.jsp");
					request.setAttribute("err", "invalid id & password");
					rd.forward(request, response);
				} else {

					RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
					request.setAttribute("Fname", bean.getFname());
					rd.forward(request, response);
				}
		}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
