package com.training.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import com.training.SqlConnection;
import com.training.iface.Command;
import com.training.iface.TravelConstant;
import com.training.model.Employee;

public class AddEmployee implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map) {
		Connection con = SqlConnection.getSqlConnection();
		Map<String, Object> map2 = new HashMap<>();
		String uri = "EmployeeLogin.jsp";
		map2.put(TravelConstant.uriPath, uri);
		String name = map.get("name");
		String phoneNum = map.get("phoneNumber");
		long phoneNumber = Long.parseLong(phoneNum);
		String userName = map.get("userName");
		String passWord = map.get("passWord");
		Employee employee = new Employee(name, phoneNumber, userName, passWord);
		String empSql = "insert into  Employee values(?,?,?,?,?)";
		 PreparedStatement custpreparedStatement = null;
		 try {
			custpreparedStatement = con.prepareStatement(empSql);
			custpreparedStatement.setInt(1, employee.getEmployeeId());
			custpreparedStatement.setString(2, employee.getEmployeeName());
			custpreparedStatement.setLong(3, employee.getPhoneNumber());
			custpreparedStatement.setString(4, employee.getUserName());
			custpreparedStatement.setString(5, employee.getPassWord());
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
}
