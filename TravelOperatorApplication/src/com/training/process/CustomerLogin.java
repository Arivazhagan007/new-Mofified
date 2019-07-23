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
				customer.setCustomerId(rs.getInt("customerId"));
				String name = rs.getString("customerName");
				map2.put(TravelConstant.userName, name);
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
}
