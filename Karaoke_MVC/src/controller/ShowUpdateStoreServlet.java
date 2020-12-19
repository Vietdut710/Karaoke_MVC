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
 * Servlet implementation class ShowUpdateStoreServlet
 */
public class ShowUpdateStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUpdateStoreServlet() {
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
		
		String id_CuaHang = request.getParameter("id");
		
		StoreBO storeBO = new StoreBO();
		Store cuaHang = new Store();
		cuaHang = storeBO.returnStoreID(id_CuaHang);
		ArrayList<Store> listCuaHang = new ArrayList<Store>();
		listCuaHang = storeBO.getListCuaHang();
		request.setAttribute("listCuaHang", listCuaHang);
		request.setAttribute("cuaHang", cuaHang);
		RequestDispatcher rd = request.getRequestDispatcher("admin/Modules/store/update.jsp");
		rd.forward(request, response);
	}

}
