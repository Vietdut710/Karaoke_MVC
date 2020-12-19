package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Store;

public class StoreDAO extends BaseDAO {

	public ArrayList<Store> getListCuaHang() {
		ArrayList<Store> returnListCuaHang = null;
		Connection conn = getConnection();
		String sql = "SELECT CH.id_cuahang,KV.id_khuvuc ,tencuahang, tenkhuvuc , COUNT(id_phong) as soluongphong , COUNT(id_nhanvien) as soluongnhanvien, CH.sdt,CH.diachi, CH.image_url\r\n"
				+ "FROM CUAHANG CH LEFT JOIN PHONG P ON P.id_cuahang = CH.id_cuahang \r\n"
				+ "				LEFT JOIN NHANVIEN NV ON NV.id_cuahang = CH.id_cuahang\r\n"
				+ "				INNER JOIN KHUVUC KV ON CH.id_khuvuc = KV.id_khuvuc\r\n"
				+ "GROUP BY CH.id_cuahang,tencuahang,tenkhuvuc,id_nhanvien,CH.sdt,CH.image_url,KV.id_khuvuc,CH.diachi";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			returnListCuaHang = new ArrayList<Store>();
			Store item = null;
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				item = new Store();
				item.setId_cuahang(rs.getString("id_cuahang"));
				item.setId_khuvuc(rs.getString("id_khuvuc"));
				item.setTenkhuvuc(rs.getString("tenkhuvuc"));
				item.setTencuahang(rs.getString("tencuahang"));
				item.setDiachi(rs.getString("diachi"));
				item.setSoluongphong(rs.getString("soluongphong"));
				item.setSoluongnhanvien(rs.getString("soluongnhanvien"));
				item.setSdt(rs.getString("sdt"));
				item.setImage_url(rs.getString("image_url"));
				returnListCuaHang.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return returnListCuaHang;
	}

	public Store returnStoreID(String id_cuahang) {
		Store returnStore = null;
		Connection conn = getConnection();
		String sql = "SELECT CH.id_cuahang, KV.id_khuvuc ,tencuahang, tenkhuvuc , COUNT(id_phong) as soluongphong , COUNT(id_nhanvien) as soluongnhanvien, CH.sdt,CH.diachi, CH.image_url\r\n"
				+ "FROM CUAHANG CH LEFT JOIN PHONG P ON P.id_cuahang = CH.id_cuahang \r\n"
				+ "LEFT JOIN NHANVIEN NV ON NV.id_cuahang = CH.id_cuahang\r\n"
				+ "INNER JOIN KHUVUC KV ON CH.id_khuvuc = KV.id_khuvuc\r\n" + "WHERE CH.id_cuahang = ?\r\n"
				+ "GROUP BY CH.id_cuahang,tencuahang,tenkhuvuc,id_nhanvien,CH.sdt,CH.image_url,KV.id_khuvuc,CH.diachi";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id_cuahang);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				returnStore = new Store();
				returnStore.setId_cuahang(rs.getString("id_cuahang"));
				returnStore.setId_khuvuc(rs.getString("id_khuvuc"));
				returnStore.setTenkhuvuc(rs.getString("tenkhuvuc"));
				returnStore.setDiachi(rs.getString("diachi"));
				returnStore.setTencuahang(rs.getString("tencuahang"));
				returnStore.setSoluongphong(rs.getString("soluongphong"));
				returnStore.setSoluongnhanvien(rs.getString("soluongnhanvien"));
				returnStore.setSdt(rs.getString("sdt"));
				returnStore.setImage_url(rs.getString("image_url"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return returnStore;
	}

	public String addCuaHang(String lastestID, String tenCuaHang, String sdt, String diaChi, String khuVuc,
			String image_url) {
		Connection conn = getConnection();
		String sql = "INSERT INTO CUAHANG(id_cuahang,id_khuvuc,tenCuaHang,sdt,diaChi,image_url) "
				+ "VALUES(?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, lastestID);
			pstmt.setString(2, khuVuc);
			pstmt.setString(3, tenCuaHang);
			pstmt.setString(4, sdt);
			pstmt.setString(5, diaChi);
			pstmt.setString(6, image_url);
			int x = pstmt.executeUpdate();
			System.out.println("ADD " + x + " record!!!");
		} catch (SQLException e) {
			String errorMessage = e.getMessage();
			if (errorMessage != null && errorMessage.contains("The duplicate key values is")) {
				return "Duplicate ID Error";
			}
		} finally {
			closeConnection(conn, pstmt, null);
		}
		return "No Error";
	}

	public String getLastestID() {
		Connection conn = getConnection();
		String sql = "SELECT TOP 1 id_cuahang FROM CUAHANG ORDER BY id_cuahang DESC";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String returnedString = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				returnedString = rs.getString("id_cuahang");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return returnedString;
	}

	public void deleteStore(String id_CuaHang) {
		Connection conn = getConnection();
		String sql = "DELETE FROM CUAHANG WHERE id_cuahang = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id_CuaHang);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);
		}

	}

	public void UpdateStoreDAO(String id_cuahang, String txtTenCuaHang, String txtDiachi, String txtSDT,
			String sltKhuVuc, String image_url) {
		Connection conn = getConnection();
		String sql = "UPDATE CUAHANG SET tencuahang = ? , id_khuvuc = ? , sdt = ? , diachi = ? , image_url = ?  WHERE id_cuahang = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, txtTenCuaHang);
			pstmt.setString(2, sltKhuVuc);
			pstmt.setString(3, txtSDT);
			pstmt.setString(4, txtDiachi);
			pstmt.setString(5, image_url);
			pstmt.setString(6, id_cuahang);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);
		}

	}

}
