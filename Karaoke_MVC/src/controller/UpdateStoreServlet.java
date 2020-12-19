package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.StoreBO;

/**
 * Servlet implementation class UpdateStoreServlet
 */
public class UpdateStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStoreServlet() {
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
		String id_cuahang = request.getParameter("id");
		String txtTenCuaHang = request.getParameter("txtTenCuaHang");
		String txtSDT = request.getParameter("txtSDT");
		String txtDiachi = request.getParameter("txtDiaChi");
		String sltKhuVuc = request.getParameter("sltKhuVuc");
		String image_url = request.getParameter("fileHinhAnh");
		
		RequestDispatcher rd = null;
		storeBO.UpdateStoreBO(id_cuahang,txtTenCuaHang,txtDiachi,txtSDT,sltKhuVuc,image_url);
		rd = request.getRequestDispatcher("ShowStoreServlet?Up=1");
		rd.forward(request, response);
	}

}
