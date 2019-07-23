package com.training.process;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.training.SqlConnection;
import com.training.iface.Command;
import com.training.iface.TravelConstant;
import com.training.model.Tour;

public class UpdateTour implements Command{

	@Override
	public Map<String, Object> execute(Map<String, String> map) {
		Connection con = SqlConnection.getSqlConnection();
		Map<String, Object> map2 = new HashMap<>();
		
		String uri = "EmployeeHome.jsp";
		map2.put(TravelConstant.uriPath, uri);
		String tourid = map.get("id");
		Integer tourId = Integer.parseInt(tourid);
		String tourCode = map.get("tourCode");
		String tourName = map.get("tourName");
		String boardingPlace = map.get("boardingPlace");
		String destinationPlace = map.get("destinationPlace");
		String startingDate = map.get("startingDate");
		LocalDate startingDate1 = LocalDate.parse(startingDate);
		String endingDate = map.get("endingDate");
		LocalDate endingDate1 = LocalDate.parse(endingDate);
		String placesCovered = map.get("placesCovered");
		String amtPerPerson = map.get("amountPerPerson");
		double amountPerPerson = Double.parseDouble(amtPerPerson);
//		Tour tour = new Tour(tourId,tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, placesCovered, amountPerPerson);
//		Tour tour = new Tour(tourId, tourCode, tourName, boardingPlace, destinationPlace, startingDate, endingDate, placesCovered, amountPerPerson);
		Tour tour = new Tour(tourId, tourCode, tourName, boardingPlace, destinationPlace, startingDate1, endingDate1, placesCovered, amountPerPerson);
	
		String sql = "Update Tour SET tourCode=?,tourName=?,boardingPlace=?,destinationPlace=?,startingDate=?,endingDate=?,placesCovered=?,amountPerPerson=? where tourId=?";
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1, tour.getTourCode());
			preparedStatement.setString(2, tour.getTourName());
			preparedStatement.setString(3, tour.getBoardingPlace());
			preparedStatement.setString(4, tour.getDestinationPlace());
			preparedStatement.setDate(5, Date.valueOf(tour.getStartingDate1()));
			preparedStatement.setDate(6, Date.valueOf(tour.getEndingDate1()));
			preparedStatement.setString(7, tour.getPlacesCovered());
			preparedStatement.setDouble(8, tour.getAmountPerPerson());
			preparedStatement.setInt(9, tour.getTourId());
			preparedStatement.executeUpdate();
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
		return map2;
	}
}
