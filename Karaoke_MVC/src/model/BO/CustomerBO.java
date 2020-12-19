package model.BO;
import java.util.ArrayList;

import model.DAO.CustomerDAO;
import model.bean.Customer;



public class CustomerBO {
	CustomerDAO customerDAO = new CustomerDAO();

	public ArrayList<Customer> getListCustomer() {
		// TODO Auto-generated method stub
		return  customerDAO.getListCustomer();
	}

}
