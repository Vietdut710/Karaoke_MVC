package model.BO;

import model.DAO.CheckLoginDAO;

public class CheckLoginBO {
CheckLoginDAO checkLoginDAO = new CheckLoginDAO();
	public int getAccountRole(String userName, String passWord) {
		return checkLoginDAO.getAccountRole(userName, passWord);
	}
}
