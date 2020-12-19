package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.HomePageBO;

/**
 * Servlet implementation class AddHomePageServlet
 */
public class AddHomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddHomePageServlet() {
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String txtTieuDe = request.getParameter("txtTieuDe");
		String txtNoiDung = request.getParameter("txtNoiDung");
		String fileHinhAnh =request.getParameter("fileHinhAnh");
		if(fileHinhAnh.equals("")) {
			fileHinhAnh = null;
		}
		HomePageBO homePageBO = new HomePageBO();
		homePageBO.addHomePage(txtTieuDe,txtNoiDung,fileHinhAnh);
		RequestDispatcher rd = request.getRequestDispatcher("ShowHomePageServlet");
		rd.forward(request, response);
	}

}
