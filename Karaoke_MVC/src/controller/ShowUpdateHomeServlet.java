package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.HomePageBO;
import model.bean.NewsHome;

/**
 * Servlet implementation class ShowUpdateHomeServlet
 */
public class ShowUpdateHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUpdateHomeServlet() {
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
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String id_newsHomePage = request.getParameter("id");
		
		HomePageBO homePage = new HomePageBO();
		NewsHome newsHome = homePage.getHomePageByID(id_newsHomePage);
		request.setAttribute("newsHome", newsHome);
		RequestDispatcher rd = request.getRequestDispatcher("admin/Modules/homepage/update.jsp");
		rd.forward(request, response);
	}

}
