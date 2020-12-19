package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckLoginDAO extends BaseDAO {
	public int getAccountRole(String userName, String passWord) {
		Connection conn = getConnection();
		String sql = "SELECT * FROM TAIKHOAN WHERE Username = ? AND Password = ? ";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, passWord);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (rs.next()) {
				if(rs.getString("account_type").equals("1")) {
					return 1;
				}
				if(rs.getString("account_type").equals("2")) {
					return 2;
				}
				if(rs.getString("account_type").equals("3")) {
					return 3;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
