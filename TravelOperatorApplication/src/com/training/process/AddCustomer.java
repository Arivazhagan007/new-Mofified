package com.training.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;


import com.training.SqlConnection;
import com.training.iface.Command;
import com.training.iface.TravelConstant;
import com.training.model.Customer;

public class AddCustomer implements Command{

	@Override
	public Map<String, Object> execute(Map<String, String> map) {
		Connection con = SqlConnection.getSqlConnection();
		Map<String, Object> map2 = new HashMap<>();
		String uri = "CustomerLogin.jsp";
		map2.put(TravelConstant.uriPath, uri);
		String name = map.get("name");
		String phoneNum = map.get("phoneNumber");
		long phoneNumber = Long.parseLong(phoneNum);
		String userName = map.get("userName");
		String passWord = map.get("passWord");
		Customer customer = new Customer(name, phoneNumber, userName, passWord);
		String custSql = "insert into Customer values(?,?,?,?,?)";
		 PreparedStatement custpreparedStatement = null;
		 try {
			custpreparedStatement = con.prepareStatement(custSql);
			custpreparedStatement.setInt(1, customer.getCustomerId());
			custpreparedStatement.setString(2, customer.getCustomerName());
			custpreparedStatement.setLong(3, customer.getPhoneNumber());
			custpreparedStatement.setString(4, customer.getUserName());
			custpreparedStatement.setString(5, customer.getPassWord());
			custpreparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				custpreparedStatement.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map2;
	}	
	
	
	
//	Connection con = null;
//	
//	public AddCustomer() {
//		super();
//		con = SqlConnection.getSqlConnection();
//	}

//	@Override
//	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String result = "CustomerLogin.jsp";
//		String name = request.getParameter("name");
//		String phoneNum = request.getParameter("phoneNumber");
//		long phoneNumber = Long.parseLong(phoneNum);
//		String userName = request.getParameter("userName");
//		String passWord = request.getParameter("passWord");
//		Customer customer = new Customer(name, phoneNumber, userName, passWord);
//		addCustomer(customer);
//		return result;
//	}

//	@Override
//	public String execute(Map<String, String> map){
//		String result = "CustomerLogin.jsp";
//		String name = map.get("name");
//		String phoneNum = map.get("phoneNumber");
//		long phoneNumber = Long.parseLong(phoneNum);
//		String userName = map.get("userName");
//		String passWord = map.get("passWord");
//		Customer customer = new Customer(name, phoneNumber, userName, passWord);
//		addCustomer(customer);
//		return result;
//	}
//		
	
//	public int addCustomer(Customer customer) {
//		
//		 String custSql = "insert into Customer values(?,?,?,?,?)";
//		 PreparedStatement custpreparedStatement = null;
//		 int addValue = 0;
//		 
//		 try {
//			custpreparedStatement = con.prepareStatement(custSql);
//			custpreparedStatement.setInt(1, customer.getCustomerId());
//			custpreparedStatement.setString(2, customer.getCustomerName());
//			custpreparedStatement.setLong(3, customer.getPhoneNumber());
//			custpreparedStatement.setString(4, customer.getUserName());
//			custpreparedStatement.setString(5, customer.getPassWord());
//			addValue = custpreparedStatement.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				custpreparedStatement.close();
//				con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//			return addValue;
//		}
	
}
