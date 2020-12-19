package model.BO;

import java.util.ArrayList;

import common.StringCommon;
import model.DAO.StoreDAO;
import model.bean.Store;

public class StoreBO {
	StoreDAO storeDAO = new StoreDAO();

	public ArrayList<Store> getListCuaHang() {

		return storeDAO.getListCuaHang();
	}

	public String addCuaHang(String tenCuaHang, String sdt, String diaChi, String khuVuc, String image_url) {
		String returnedString = null;
		if("".equals(tenCuaHang)||"".equals(sdt)||"".equals(diaChi)) {
			return "Required filed Error";
		}
		for(int i = 1; i<=10 ; i++) {
			String lastestID = storeDAO.getLastestID();
			if(lastestID == "") {
				lastestID = "CH001";
			}else {
				long oderNumber = Long.valueOf(lastestID.substring(2,5));
				oderNumber++;
				lastestID = "CH" + StringCommon.convertNumberToString(oderNumber, 3);
			}
			String returnedMessage = storeDAO.addCuaHang(lastestID,tenCuaHang,sdt,diaChi,khuVuc,image_url);
			if("Duplicate ID Error".equals(returnedMessage)) {
				returnedString = "Duplicate ID Error";
				continue;
			}else if("No Error".equals(returnedMessage)){
				returnedString = "No Error";
				break;
			}
		}
		
		return returnedString;
		
	}

	public Store returnStoreID(String id_CuaHang) {
		// TODO Auto-generated method stub
		return storeDAO.returnStoreID(id_CuaHang);
	}

	public void deleteStore(String id_CuaHang) {
		storeDAO.deleteStore(id_CuaHang);
		
	}

	public void UpdateStoreBO(String id_cuahang, String txtTenCuaHang, String txtDiachi, String txtSDT,
			String sltKhuVuc, String image_url) {
		storeDAO.UpdateStoreDAO(id_cuahang,txtTenCuaHang,txtDiachi,txtSDT,sltKhuVuc,image_url);
		
	}




}
