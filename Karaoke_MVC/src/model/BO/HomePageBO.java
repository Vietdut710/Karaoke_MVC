package model.BO;

import java.util.ArrayList;

import common.StringCommon;
import model.DAO.HomePageDAO;
import model.bean.NewsHome;

public class HomePageBO {
	HomePageDAO homePageDAO = new HomePageDAO();

	public ArrayList<NewsHome> getListNewHome() {
		return homePageDAO.getListNewHome();
	}

	public String addHomePage(String txtTieuDe, String txtNoiDung, String fileHinhAnh) {
		String returnedString = null;
		if ("".equals(txtTieuDe) || "".equals(txtNoiDung) || "".equals(fileHinhAnh)) {
			return "Required field error";
		}
		for (int i = 1; i <= 10; i++) {
			String lastestIDHomePage = homePageDAO.getLastestID();
			if(lastestIDHomePage == "") {
				lastestIDHomePage = "NH001";
			}else{
				long oderNumber = Long.valueOf(lastestIDHomePage.substring(2,5));
				oderNumber++;
				lastestIDHomePage ="NH" + StringCommon.convertNumberToString(oderNumber, 3);
			}
			String returnedMessage = homePageDAO.addHomePage(lastestIDHomePage,txtTieuDe, txtNoiDung, fileHinhAnh);
			if("Duplicate ID Error".equals(returnedMessage)) {
				returnedString = "Duplicate ID Error";
				continue;
			}else if("No Error".equals(returnedMessage)) {
				returnedString = "No Error";
				break;
			}
		}

		return returnedString;

	}

	public void deleteHomeByID(String id_newsHomePage) {
		homePageDAO.deleteHomeByID(id_newsHomePage);
		
	}

	public NewsHome getHomePageByID(String id_newsHomePage) {
		return homePageDAO.getHomePageByID(id_newsHomePage);
	}

}
