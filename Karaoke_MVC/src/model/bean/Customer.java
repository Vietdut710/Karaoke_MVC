package model.bean;

public class Customer {
	private String id_Khachhang;
	private String hoTen;
	private String diaChi;
	private String sdt;
	private String image_url;
	
	public String getId_Khachhang() {
		return id_Khachhang;
	}
	public void setId_Khachhang(String id_Khachhang) {
		this.id_Khachhang = id_Khachhang;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
}
