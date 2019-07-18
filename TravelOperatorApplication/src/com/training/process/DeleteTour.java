package com.training.process;

import java.sql.Connection;
import java.util.Map;

import java.sql.PreparedStatement;

import com.training.SqlConnection;
import com.training.iface.Command;

public class DeleteTour implements Command{

	@Override
	public String execute(Map<String, String> map) {
		Connection con=SqlConnection.getSqlConnection();
		String result ="EmployeeHome.jsp";
		String id = map.get("tourId");
		int tourId = Integer.parseInt(id);
		String sql = "delete from Tour where tourId=?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, tourId);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	//	Connection con;
//	public DeleteTour() {
//		super();
//		con=SqlConnection.getSqlConnection();
//	}
	
//	@Override
//	public String execute(Map<String, String> map) {
//		String result ="EmployeeHome.jsp";
//		String id = map.get("tourId");
//		int tourId = Integer.parseInt(id);
//		delete(tourId);
//		return result;
//	}
//	public void delete(int tourId){
//		
//		String sql = "delete from Tour where tourId=?";
//		PreparedStatement preparedStatement = null;
//		try {
//			preparedStatement = con.prepareStatement(sql);
//			preparedStatement.setInt(1, tourId);
//			preparedStatement.executeUpdate();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				preparedStatement.close();
//				con.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}



	
	
}
