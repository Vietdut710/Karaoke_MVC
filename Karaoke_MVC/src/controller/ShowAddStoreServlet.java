package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.StoreBO;
import model.bean.Store;

/**
 * Servlet implementation class ShowAddStoreServlet
 */
public class ShowAddStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAddStoreServlet() {
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
		
		StoreBO storeBO = new StoreBO();
		ArrayList<Store> listCuaHang = new ArrayList<Store>();
		listCuaHang = storeBO.getListCuaHang();
		request.setAttribute("listCuaHang", listCuaHang);
		RequestDispatcher rd = request.getRequestDispatcher("admin/Modules/store/add.jsp");
		rd.forward(request, response);
	
	}
}
