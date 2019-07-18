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
import com.training.model.Tour;

public class SearchTour implements Command {
//	HashMap<String, Object> map1 = new HashMap<>();
//	ArrayList<Tour> list = new ArrayList<>();
//	String str= "";
//	String uri ="val";
//	map1.put("a", str);
//	map1.put("s", list);
	
	@Override
	public Map<String, Object> execute(Map<String, String> map) {	
		String uri = "CustomerHome.jsp";
		Map<String, Object> map2 = new HashMap<>();
		map2.put(TravelConstant.uriPath, uri);
		
		String source = map.get("sourcePlace");
		String destination = map.get("destinationPlace");
		
		List<Tour> list = new ArrayList<>();
		Connection con = SqlConnection.getSqlConnection();
		String sql = "select * from Tour where boardingPlace=? AND destinationPlace=?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, source);
			preparedStatement.setString(2, destination);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
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
				Tour tour = new Tour(tourId, tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, fromDate, toDate, placesCovered, amountPerPerson,amountPerPerson1);
				list.add(tour);
			}
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
		map2.put(TravelConstant.list, list);
		return map2;
	}
	
//	public List<Tour> ViewSelectedTour(String source,String destination){
//		List<Tour> list = new ArrayList<>();
//		Connection con = SqlConnection.getSqlConnection();
//		String sql = "select * from Tour where boardingPlace=? AND destinationPlace=?";
//		PreparedStatement preparedStatement = null;
//		try {
//			preparedStatement = con.prepareStatement(sql);
//			preparedStatement.setString(1, source);
//			preparedStatement.setString(2, destination);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			while (resultSet.next()) {
//				int tourId = resultSet.getInt("tourId");
//				String tourCode = resultSet.getString("tourCode");
//				String tourName = resultSet.getString("tourName");
//				String boardingPlace = resultSet.getString("boardingPlace");
//				String destinationPlace = resultSet.getString("destinationPlace");
//				LocalDate startingDate = resultSet.getDate("startingDate").toLocalDate();
//				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//				String fromDate = startingDate.format(dateTimeFormatter);
//				LocalDate endingDate = resultSet.getDate("endingDate").toLocalDate();
//				String toDate = endingDate.format(dateTimeFormatter);
//				String placesCovered = resultSet.getString("placesCovered");
//				double amountPerPerson = resultSet.getDouble("amountPerPerson");
//				DecimalFormat decimalFormat = new DecimalFormat("##,##,##,##,###.00");
//				String amountPerPerson1 = decimalFormat.format(amountPerPerson);
//				Tour tour = new Tour(tourId, tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, fromDate, toDate, placesCovered, amountPerPerson,amountPerPerson1);
//				list.add(tour);
//			}
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
//		return list;	
//	}
}
