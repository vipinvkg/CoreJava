package com.raystec.Studentmgt;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentCtl
 */
public class StudentCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentCtl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean bean = new StudentBean();
		try {
			List<StudentBean> list = StudentModel.search(bean);
			RequestDispatcher rd = request.getRequestDispatcher("/Studentlist.jsp");
			request.setAttribute("lis", list);			
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean bean = new StudentBean();
		bean.setRollNo(request.getParameter("Roll"));
		
		StudentModel m = new StudentModel();
		
		try {
			bean=m.get(bean);
			if (bean.getFirstName()!=null) {
				RequestDispatcher rd = request.getRequestDispatcher("/StudentGetData.jsp");
				request.setAttribute("rl", bean.getRollNo());
				request.setAttribute("fn", bean.getFirstName());
				request.setAttribute("ln", bean.getLastName());
				request.setAttribute("se", bean.getSession());
				
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("/StudentGet.jsp");
				request.setAttribute("err","Invalid Roll No");
				rd.forward(request, response);
			}
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	
	}

	}


