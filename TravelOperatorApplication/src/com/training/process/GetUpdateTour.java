package com.training.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.training.SqlConnection;
import com.training.iface.Command;
import com.training.iface.TravelConstant;
import com.training.model.Tour;

public class GetUpdateTour implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map) {
		Map<String, Object> map2 = new HashMap<>();
		ArrayList<Tour> list = new ArrayList<>();
		Connection con = SqlConnection.getSqlConnection();
		String uri = "UpdateTour.jsp";
		map2.put(TravelConstant.uriPath, uri);
		String id = map.get("tourId");
		Integer tourId = Integer.parseInt(id);
		String sql = "select * from Tour where tourId=?";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1, tourId);
			ResultSet resultSet =  preparedStatement.executeQuery();
			while (resultSet.next()) {
				int tourId1 = resultSet.getInt("tourId");
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
				Tour tour = new Tour(tourId1, tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, fromDate, toDate, placesCovered, amountPerPerson,amountPerPerson1);
				list.add(tour);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				preparedStatement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		map2.put(TravelConstant.list, list);
		return map2;
	}

}
