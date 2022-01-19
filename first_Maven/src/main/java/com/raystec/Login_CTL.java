package com.raystec;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name="Login_CTL",urlPatterns = "/Login_CTL")
public class Login_CTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_CTL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RegistrationBean bean = new RegistrationBean();
		bean.setLoginid(request.getParameter("user"));
		bean.setPassword(request.getParameter("pwd"));
		String us = request.getParameter("user");
		String pw= request.getParameter("pwd");
		
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
										
					Cookie ckuser = new Cookie("vipuser", us);
					ckuser.setMaxAge(24*60*60);
					response.addCookie(ckuser);
															
					Cookie ckpwd = new Cookie("vippwd", pw);
					ckpwd.setMaxAge(24*60*60);
					response.addCookie(ckpwd);
					
					HttpSession session = request.getSession(true);
					session.setAttribute("myname",bean.getFname());
					Date Created = new Date(session.getCreationTime());
					Date accessed = new Date(session.getLastAccessedTime());
					
					
					System.out.println("id: "+session.getId());
					System.out.println("created Date"+session.getCreationTime());
					System.out.println("Accessed Date"+session.getLastAccessedTime());
					rd.forward(request, response);
				}
		}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
	}
