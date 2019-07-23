package com.training.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.SqlConnection;
import com.training.iface.Command;
import com.training.iface.TravelConstant;
import com.training.model.Employee;
import com.training.model.Tour;

public class ViewTour extends Employee implements Command{
	
	@Override
	public Map<String, Object> execute(Map<String, String> map){
		Connection con = SqlConnection.getSqlConnection();
		Map<String, Object> map2 = new HashMap<>();
		String uri = "EmployeeHome.jsp";
		map2.put(TravelConstant.uriPath, uri);
		List<Tour> list = new ArrayList<>();
		String sql = "Select * from Tour where employeeId=?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, super.getEmployeeId());
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int tourId = resultSet.getInt("tourId");
				String tourCode = resultSet.getString("tourCode");
				String tourName = resultSet.getString("tourName");
				String boardingPlace = resultSet.getString("boardingPlace");
				String destinationPlace = resultSet.getString("destinationPlace");
				LocalDate startingDate = resultSet.getDate("startingDate").toLocalDate();
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				String fromDate = startingDate.format(dateTimeFormatter);
				LocalDate endingDate = resultSet.getDate("endingDate").toLocalDate();
				String toDate = endingDate.format(dateTimeFormatter);
				String placesCovered = resultSet.getString("placesCovered");
				double amountPerPerson = resultSet.getDouble("amountPerPerson");
				DecimalFormat decimalFormat = new DecimalFormat("##,##,##,##,###.00");
				String amountPerPerson1 = decimalFormat.format(amountPerPerson);
//				Tour tour = new Tour(tourId, tourCode, tourName, boardingPlace, destinationPlace, fromDate, toDate, placesCovered, amountPerPerson);
//				Tour tour = new Tour(tourId, tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, fromDate, toDate, placesCovered, amountPerPerson);
				Tour tour = new Tour(tourId, tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, fromDate, toDate, placesCovered, amountPerPerson,amountPerPerson1);
				list.add(tour);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				con.close();
				resultSet.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		map2.put(TravelConstant.list, list);
		return map2;
	}
}
