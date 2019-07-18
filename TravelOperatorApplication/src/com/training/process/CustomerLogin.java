package com.training.process;

import com.training.SqlConnection;

import com.training.iface.Command;
import com.training.iface.TravelConstant;
import com.training.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;



public class CustomerLogin implements Command{
	
	@Override
	public Map<String, Object> execute(Map<String, String> map){
		Connection con = SqlConnection.getSqlConnection();
		Map<String, Object> map2 = new HashMap<>();
		String uri = null;
		String userName = map.get("userName");
		String passWord = map.get("passWord");
		Customer customer = new Customer(userName, passWord);
		String sql="select * from Customer where userName=? AND passWord=?";
		PreparedStatement validatePreparedStatement=null;
		try {
			validatePreparedStatement=con.prepareStatement(sql);
			
			validatePreparedStatement.setString(1, customer.getUserName());
			validatePreparedStatement.setString(2, customer.getPassWord());
			ResultSet rs=validatePreparedStatement.executeQuery();
			if(rs.next()){
				uri= "CustomerHome.jsp";
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				validatePreparedStatement.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		map2.put(TravelConstant.uriPath, uri);
		return map2;
	}
	
	
	//	Connection con = null;
//	public CustomerLogin() {
//		super();
//		con = SqlConnection.getSqlConnection();
//	}
//	

//	@Override
//	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		String result = "index.jsp";
//		String userName = request.getParameter("userName");
//		String passWord = request.getParameter("passWord");
//		Customer customer = new Customer(userName, passWord);
//		customerLoginValidate(customer);
//		return result;
//	}
	
//	@Override
//	public String execute(Map<String, String> map){
//		String result = "CustomerHome.jsp";
//		String userName = map.get("userName");
//		String passWord = map.get("passWord");
//		Customer customer = new Customer(userName, passWord);
//		customerLoginValidate(customer);
//		return result;
//	}
//
//		
//	public boolean customerLoginValidate(Customer customer) {
//		boolean result=false;
//		String sql="select * from Customer where username=? AND password=?";
//		PreparedStatement validatePreparedStatement=null;
//		
//		try {
//			validatePreparedStatement=con.prepareStatement(sql);
//			
//			validatePreparedStatement.setString(1, customer.getUserName());
//			validatePreparedStatement.setString(2, customer.getPassWord());
//			
//			ResultSet rs=validatePreparedStatement.executeQuery();
//			if(rs.next()){
//				result=true;
//			}
//			
//		}catch (Exception e) {
//		e.printStackTrace();
//		}
//		finally {
//			try {
//				validatePreparedStatement.close();
//				con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return result;
//	}







}
