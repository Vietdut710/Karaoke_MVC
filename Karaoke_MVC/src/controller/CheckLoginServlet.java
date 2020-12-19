package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.CheckLoginBO;

/**
 * Servlet implementation class CheckLoginServlet
 */
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final int INVALID_ACCOUNT = 0;
		final int ADMIN_ACCOUNT = 1 ;
		final int EMPLOYEE_ACCOUNT = 2;
		final int USER_ACCOUNT = 3;
		
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		
		CheckLoginBO checkLoginBO = new CheckLoginBO();
		RequestDispatcher rd = null;
		
		if(checkLoginBO.getAccountRole(userName, passWord)==ADMIN_ACCOUNT) {
			rd = request.getRequestDispatcher("ShowIndexAdminServlet");	
		}
		if(checkLoginBO.getAccountRole(userName, passWord)==EMPLOYEE_ACCOUNT) {
			rd = request.getRequestDispatcher("ShowIndexStaffServlet");
		}
		if(checkLoginBO.getAccountRole(userName, passWord)==USER_ACCOUNT) {
			rd = request.getRequestDispatcher("ShowIndexHomeServlet");
		}
		if(checkLoginBO.getAccountRole(userName, passWord)==INVALID_ACCOUNT) {
			rd = request.getRequestDispatcher("ErrorLoginServlet");
		}
		rd.forward(request, response);
	}

}
