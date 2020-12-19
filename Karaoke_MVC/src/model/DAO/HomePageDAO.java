package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.NewsHome;

public class HomePageDAO extends BaseDAO {

	public ArrayList<NewsHome> getListNewHome() {
		ArrayList<NewsHome> retunedList = new ArrayList<NewsHome>();
		Connection conn = getConnection();
		String sql = "SELECT * FROM NEWS_HOME";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			NewsHome item = null;
			while (rs.next()) {
				item = new NewsHome();
				item.setId_NewsHome(rs.getString("id_newshome"));
				item.setTieuDe(rs.getString("tieude"));
				item.setNoiDung(rs.getString("noidung"));
				item.setImage("image_url");
				retunedList.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return retunedList;
	}

	public String addHomePage(String LastestIDHomePage, String txtTieuDe, String txtNoiDung, String fileHinhAnh) {
		Connection conn = getConnection();
		String sql = "INSERT INTO NEWS_HOME(id_newshome,tieude,noidung,image_url) VALUES (?,?,?,?) ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, LastestIDHomePage);
			pstmt.setString(2, txtTieuDe);
			pstmt.setString(3, txtNoiDung);
			pstmt.setString(4, fileHinhAnh);
			int x = pstmt.executeUpdate();
			System.out.println("Số record đã chèn : " + x);
		} catch (SQLException e) {
			e.printStackTrace();
			String errorMessage = e.getMessage();
			if(errorMessage != null && errorMessage.contains("The duplicate key values is")) {
				return "Duplicate ID Error";
			}
		} finally {
			closeConnection(conn, pstmt, null);
		}
		return "No Error";
	}

	public String getLastestID() {
		Connection conn = getConnection();
		String sql = "SELECT TOP 1 id_newshome FROM NEWS_HOME ORDER BY id_newshome DESC";
		String getLastestID = null;

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				getLastestID = rs.getString("id_newshome");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		return getLastestID;
	}

	public void deleteHomeByID(String id_newsHomePage) {
		Connection conn = getConnection();
		String sql = "DELETE FROM NEWS_HOME WHERE id_newshome = ?";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id_newsHomePage);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, null);
		}
	}

	public NewsHome getHomePageByID(String id_newsHomePage) {
		NewsHome getHomePageByID = null;
		Connection conn = getConnection();
		String sql = "SELECT * FROM NEWS_HOME WHERE id_newshome = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id_newsHomePage);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				getHomePageByID = new NewsHome();
				getHomePageByID.setId_NewsHome(rs.getString("id_newshome"));
				getHomePageByID.setTieuDe(rs.getString("tieude"));
				getHomePageByID.setNoiDung(rs.getString("noidung"));
				getHomePageByID.setImage(rs.getString("image_url"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(conn, pstmt, rs);
		}
		
		return getHomePageByID;
	}

}
