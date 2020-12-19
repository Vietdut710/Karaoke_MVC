package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Customer;

public class CustomerDAO extends BaseDAO {

	public Customer getListCustomerById(String id_khachhang) {
		Connection conn = getConnection();
		String sql = "SELECT * FROM KHACHHANG id_khachhang = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Customer returnCustomer = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id_khachhang);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				returnCustomer = new Customer();
				returnCustomer.setId_Khachhang(rs.getString("id_khachhang"));
				returnCustomer.setHoTen(rs.getString("hoten"));
				returnCustomer.setDiaChi(rs.getString("diachi"));
				returnCustomer.setSdt(rs.getString("sdt"));
				returnCustomer.setImage_url("image_url");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return returnCustomer;
	}

	public ArrayList<Customer> getListCustomer() {
		ArrayList<Customer> returnedList = null;
		Connection conn = getConnection();
		String sql = "SELECT * FROM KHACHHANG";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Customer item = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			returnedList = new ArrayList<Customer>();
			while(rs.next()) {
				item = new Customer();
				item.setId_Khachhang(rs.getString("id_khachhang"));
				item.setHoTen(rs.getString("hoten"));
				item.setDiaChi(rs.getString("diachi"));
				item.setSdt(rs.getString("sdt"));
				item.setImage_url("image_url");
				returnedList.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return returnedList;
	}
}
