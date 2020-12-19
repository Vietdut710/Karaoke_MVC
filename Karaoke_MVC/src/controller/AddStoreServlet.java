package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BO.StoreBO;

/**
 * Servlet implementation class AddStoreServlet
 */
public class AddStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStoreServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String tenCuaHang = request.getParameter("txtTenCuaHang");
		String sdt = request.getParameter("txtSDT");
		String diaChi = request.getParameter("txtDiaChi");
		String khuVuc = request.getParameter("sltKhuVuc");
		String image_url = request.getParameter("fileHinhAnh");

		if (image_url.equals("")) {
			image_url = null;
		}
		RequestDispatcher rd = null;
		StoreBO storeBO = new StoreBO();
		if ("No Error".equals(
				storeBO.addCuaHang(tenCuaHang, sdt, diaChi, khuVuc, image_url))) {
			rd = request.getRequestDispatcher("ShowStoreServlet");

		}
		rd.forward(request, response);
	}

}
