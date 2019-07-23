package com.training.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.training.SqlConnection;
import com.training.iface.Command;
import com.training.iface.TravelConstant;
import com.training.model.Employee;

public class EmployeeLogin implements Command{

	@Override
	public Map<String, Object> execute(Map<String, String> map){
		Connection con = SqlConnection.getSqlConnection();
		Map<String, Object> map2 = new HashMap<>();
		String uri = null;
		String userName = map.get("userName");
		String passWord = map.get("passWord");
		Employee employee = new Employee(userName, passWord);
		String empSql="select * from Employee where userName=? AND passWord=?";
		PreparedStatement validatePreparedStatement=null;
		
		try {
			validatePreparedStatement=con.prepareStatement(empSql);
			
			validatePreparedStatement.setString(1, employee.getUserName());
			validatePreparedStatement.setString(2, employee.getPassWord());
			
			ResultSet rs=validatePreparedStatement.executeQuery();
			if(rs.next()){
				employee.setEmployeeId(rs.getInt("employeeId"));
				String name = rs.getString("employeeName");
				map2.put(TravelConstant.userName, name);
				uri = "EmployeeHome.jsp";
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
